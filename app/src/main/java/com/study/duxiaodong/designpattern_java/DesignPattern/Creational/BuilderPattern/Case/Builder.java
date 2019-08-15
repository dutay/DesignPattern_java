package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.BuilderPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 11:09
 * description : 组装电脑的过程
 */
public abstract class Builder {

    //第一步：装CPU
    public abstract void buildCPU();

    //第二步：装主板
    public abstract void buildMainBoard();

    //第三步：装硬盘
    public abstract void buildHD();

    //获得组装好的对象
    public abstract Computer getComputer();


}
