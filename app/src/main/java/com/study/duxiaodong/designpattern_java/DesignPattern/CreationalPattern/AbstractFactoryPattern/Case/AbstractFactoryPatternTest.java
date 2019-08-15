package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.AbstractFactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 18:06
 * description : 抽象工厂模式
 */
public class AbstractFactoryPatternTest {

    public static void main(String[] args) {
        //创建工厂A实例
        FactoryA factoryA = new FactoryA();
        //生产容器A
        factoryA.createContainerProduct().show();
        //生产模具A
        factoryA.createMouldProduct().show();


        //创建工厂A实例
        FactoryB factoryB = new FactoryB();
        //生产容器A
        factoryB.createContainerProduct().show();
        //生产模具A
        factoryB.createMouldProduct().show();
    }
}
