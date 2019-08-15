package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.DecoratorPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:46
 * description : 咖啡装饰器（加糖）
 */
public class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    //从外部传入coffee对象
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public void makeCoffee() {
        addSugar();
        coffee.makeCoffee();
        addIce();
    }

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addIce(){
        System.out.println("加冰");
    }

}
