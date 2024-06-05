package com.msb.hjy_backend.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjy_backend.common.constant.HttpStatus;
import com.msb.hjy_backend.common.core.domain.BaseResponse;
import com.msb.hjy_backend.common.core.page.PageDomain;
import com.msb.hjy_backend.common.core.page.PageResult;
import com.msb.hjy_backend.common.utils.ServletUtils;

import java.util.ArrayList;
import java.util.List;

//基础的控制器
public class BaseController {

    public static final String PAGE_NUM = "pageNum";
    public static final String PAGE_SIZE = "pageSize";


    //分装分页数据
    public static PageDomain getPageDomain(){
        // 获取分页参数
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        return pageDomain;
    }

    //封装调用pageHelper的startpage方法
    protected void startPage(){
        PageDomain pageDomain = getPageDomain();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();

        if(null != pageNum && null != pageSize){
            PageHelper.startPage(pageNum,pageSize);
        }
    }

    // 响应分页数据
    protected PageResult getData(List<?> list){
        PageResult pageResult = new PageResult();
        pageResult.setCode(HttpStatus.SUCCESS);
        pageResult.setMsg("分页查询成功");
        pageResult.setRows(list);
        pageResult.setTotal(new PageInfo(list).getTotal());
        return pageResult;
    }

    /**
     * 响应返回的结果 （增删查改操作
     * @param rows 受影响的行数
     * @return
     */
    protected BaseResponse toAjax(int rows){
      return rows > 0 ? BaseResponse.success(rows) : BaseResponse.fail("操作失败");
    }
}
