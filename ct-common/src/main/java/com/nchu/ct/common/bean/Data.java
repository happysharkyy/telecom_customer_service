package com.nchu.ct.common.bean;
/*
数据对象
 */
public class Data implements Val{
    public String content;

    public void setValue(String value){
        this.content = value;
    }


    @Override
    public Object value() {
        return null;
    }
}
