package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.BuilderPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 11:27
 * description :建造者模式
 */
public class BuilderPatternTest {
    public static void main(String[] args) {

        //老板
        Director director = new Director();

        //装机人员
        ConcreteBuilder builder = new ConcreteBuilder();

        //老板委派装机人员装电脑
        director.construct(builder);

        //电脑装好后进行展示
        builder.getComputer().show();
    }
}
