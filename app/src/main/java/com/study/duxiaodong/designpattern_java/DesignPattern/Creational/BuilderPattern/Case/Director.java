package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.BuilderPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 11:20
 * description : 老板委派任务给装机人员
 */
public class Director {

    //指挥装机人员组装电脑
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildHD();
    }
}
