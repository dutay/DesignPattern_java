package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.FactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 16:23
 * description : 工厂方法模式
 */
public class FactoryPatternTest {

    public static void main(String[] args) {

        //客户要工厂A生产的产品A
        Factory_A factory_a = new Factory_A();
        factory_a.createProduct().show();

        //客户要工厂B生产的产品B
        Factory_B factory_b = new Factory_B();
        factory_b.createProduct().show();

        //客户要工厂C生产的产品C
        Factory_C factory_c = new Factory_C();
        factory_c.createProduct().show();
    }
}
