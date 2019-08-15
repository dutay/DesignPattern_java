package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.DecoratorPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:45
 * description : 制作普通咖啡
 */
public class CommonCoffee implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("普通咖啡");
    }
}
