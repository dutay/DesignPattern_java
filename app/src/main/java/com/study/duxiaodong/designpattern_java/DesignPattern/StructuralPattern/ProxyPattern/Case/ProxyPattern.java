package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.ProxyPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:51
 * description :装饰者模式
 */
public class ProxyPattern {

    public static void main(String[] args) {
        //普通coffee对象
        Coffee commonCoffee = new Son();

        //儿子买咖啡
        commonCoffee.buyCoffee();

        //代理对象
        Proxy proxy = new Proxy();

        //
        proxy.buyCoffee();
    }

}
