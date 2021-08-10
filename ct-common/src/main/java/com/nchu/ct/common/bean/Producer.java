package com.nchu.ct.common.bean;
/*
生产者接口
 */
public interface Producer {
    /*
    生产数据
     */
    public void produce();

    public void setIn(DataIn in);

    public void setOut(DataOut out);
}
