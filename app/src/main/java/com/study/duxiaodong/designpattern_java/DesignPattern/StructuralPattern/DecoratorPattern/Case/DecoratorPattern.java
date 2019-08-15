package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.DecoratorPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:51
 * description :装饰者模式
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        //普通coffee对象
        Coffee commonCoffee = new CommonCoffee();

        //制作普通咖啡
        commonCoffee.makeCoffee();

        //装饰类对象
        CoffeeDecorator decorator = new CoffeeDecorator(commonCoffee);

        //加糖 加冰
        decorator.makeCoffee();
    }

}
