package com.nchu.ct.common.bean;

import java.io.IOException;

/*
生产者接口
 */
public interface Producer extends Cloneable{
    /*
    生产数据
     */
    public void produce();

    public void setIn(DataIn in);

    public void setOut(DataOut out);

    public  void close() throws IOException;
}
