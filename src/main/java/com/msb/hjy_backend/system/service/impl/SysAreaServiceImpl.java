package com.msb.hjy_backend.system.service.impl;

import com.msb.hjy_backend.system.domain.SysArea;
import com.msb.hjy_backend.system.domain.dto.SysAreaDto;
import com.msb.hjy_backend.system.mapper.SysAreaMapper;
import com.msb.hjy_backend.system.service.SysAreaService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysAreaServiceImpl implements SysAreaService {

    @Resource
    SysAreaMapper sysAreaMapper;
    @Override
    public List<SysAreaDto> findAeraAsTree() {
        // 获取区域数据
        List<SysArea> lists = sysAreaMapper.findAll();


        // element needs to convert to SysAreaDto from SysArea
        return lists.stream() //集合转化成stream 流
                .filter(area -> area.getParentCode().equals(0)) // 做筛选根节点
                .map(area -> {         //将数据进行转换成为dto
                    SysAreaDto sysAreaDto = new SysAreaDto();
                    sysAreaDto.setCode(area.getCode());
                    sysAreaDto.setName(area.getName());
                    sysAreaDto.setChildrenSysArea(getChildrenArea(sysAreaDto, lists));
                    return sysAreaDto;
                }).collect(Collectors.toList());

    }

    /**
     * 递归设置区域信息
     * @param parentSysAreaDto 上级区域信息
     * @param lists 所有区域信息
     * @return
     */
    private List<SysAreaDto> getChildrenArea(SysAreaDto parentSysAreaDto, List<SysArea> lists) {
        List<SysArea> subAreaList = lists.stream().filter(sysArea -> sysArea.getParentCode().equals(parentSysAreaDto.getCode())) //获取当前父区域的子节点
                .collect(Collectors.toList());  //将当前流转化成list

        // 转换成dto对象
        if(subAreaList!=null && subAreaList.size()!=0){
            return subAreaList.stream().map( area -> {
                SysAreaDto subSysAreaDto = new SysAreaDto();
                subSysAreaDto.setName(area.getName());
                subSysAreaDto.setCode(area.getCode());
                // 设置 子节点， 直到获取叶子节点
                subSysAreaDto.setChildrenSysArea(getChildrenArea(subSysAreaDto, lists));
                return subSysAreaDto;
            }).collect(Collectors.toList());
        }
        return null;
    }
}
