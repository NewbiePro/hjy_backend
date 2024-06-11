package com.msb.hjy_backend.community.domain.dto;

import cn.afterturn.easypoi.excel.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ExcelTarget("users") // 标识当前类用于excel的导入和导出
@Data
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -3089672041013027348L;

    @Excel(name = "编号", orderNum = "1")
    private String userId;
    @Excel(name = "姓名", orderNum = "2")
    private String userName;
    @Excel(name = "年龄", orderNum = "4")
    private Integer age;
    @Excel(name = "生日", orderNum = "3")
    private Date brithDate;
    @Excel(name ="状态", orderNum = "6", replace = {"未激活_0","激活_1"})
    private String status;

    @Excel(name="爱好")
    private List<String> hobby;


//    @ExcelIgnore
//    @ExcelEntity(name = "身份信息")
//    private Card card;
//    @ExcelIgnore
//    @ExcelCollection(name = "订单信息", orderNum = "8")
//    private List<Order> orderList;
}
