package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.ProxyPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:46
 * description : 咖啡装饰器（加糖）
 */
public class Proxy implements Coffee {

    private Coffee coffee;

    //创建代理对象
    public Proxy(){
        if (coffee==null){
            this.coffee = coffee;
        }

    }
    @Override
    public void buyCoffee() {
        coffee.buyCoffee();
        buyTea();
        buyMilk();
    }

    public void buyTea(){
        System.out.println("帮儿子买茶");
    }

    public void buyMilk(){
        System.out.println("帮儿子买牛奶");
    }

}
