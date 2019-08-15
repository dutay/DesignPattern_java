package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.SimpleFactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 16:23
 * description : 简单工厂模式
 */
public class SimpleFactoryPatternTest {

    public static void main(String[] args) {

        //客户要产品A
        Factory.createProduct("A").show();

        //客户要产品B
        Factory.createProduct("B").show();

        //客户要产品C
        Factory.createProduct("C").show();
    }
}
