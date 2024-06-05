package com.msb.hjy_backend.common.core.common;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
// 自定义填充控制器
public class MyMetaObjectHandler implements MetaObjectHandler {
    // insert的时候填充的字段
    @Override
    public void insertFill(MetaObject metaObject) {
        //根据属性名称填充的字段
        this.strictInsertFill(metaObject, "createBy", String.class, "admin");
        this.strictInsertFill(metaObject, "updateBy", String.class, "admin");
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "updateTime", Date.class, new Date());
    }

    // update的时候，填充字段
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateBy", String.class, "admin");
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}
