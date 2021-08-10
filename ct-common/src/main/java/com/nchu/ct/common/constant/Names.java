package com.nchu.ct.common.constant;

import com.nchu.ct.common.bean.Val;
/*
常量枚举类
 */
public enum Names implements Val {
    NAMESPACE("ct");

    private String name;

    private Names(String ct) {
        this.name = ct;
    }

    @Override
    public Object value() {
        return null;
    }
}
