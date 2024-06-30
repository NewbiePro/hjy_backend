package com.msb.hjy_backend.web.controller.community;

import com.msb.hjy_backend.common.core.controller.BaseController;
import com.msb.hjy_backend.common.core.page.PageResult;
import com.msb.hjy_backend.community.domain.HjyBuilding;
import com.msb.hjy_backend.community.domain.HjyCommunity;
import com.msb.hjy_backend.community.domain.dto.HjyBuildingDto;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityDto;
import com.msb.hjy_backend.community.service.HjyBuildingService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;

/**
 * 楼栋 (HjyBuilding)表控制层
 *
 * @author huangaar
 * @since 2024-06-29 12:15:46
 */
@RestController
@RequestMapping("/community/building")
public class HjyBuildingController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private HjyBuildingService hjyBuildingService;

    /**
     * 分页查询
     *
     * @param hjyBuilding 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping("/list")
    @PreAuthorize("@pe.hasPerms('system:building:list')")
    public PageResult list(HjyBuilding hjyBuilding){
        System.out.println("shit");
        //封装调用pageHelper的startpage方法
        startPage();
        //得到数据
        List<HjyBuildingDto> list = hjyBuildingService.queryList(hjyBuilding);
        //封装数据
        return getData(list);
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public ResponseEntity<HjyBuilding> queryById(@PathVariable("id")  id) {
//        return ResponseEntity.ok(this.hjyBuildingService.queryById(id));
//    }

//    /**
//     * 新增数据
//     *
//     * @param hjyBuilding 实体
//     * @return 新增结果
//     */
//    @PostMapping
//    public ResponseEntity<HjyBuilding> add(HjyBuilding hjyBuilding) {
//        return ResponseEntity.ok(this.hjyBuildingService.insert(hjyBuilding));
//    }
//
//    /**
//     * 编辑数据
//     *
//     * @param hjyBuilding 实体
//     * @return 编辑结果
//     */
//    @PutMapping
//    public ResponseEntity<HjyBuilding> edit(HjyBuilding hjyBuilding) {
//        return ResponseEntity.ok(this.hjyBuildingService.update(hjyBuilding));
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param id 主键
//     * @return 删除是否成功
//     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById( id) {
//        return ResponseEntity.ok(this.hjyBuildingService.deleteById(id));
//    }

}

