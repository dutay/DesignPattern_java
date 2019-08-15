package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.ProxyPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 17:45
 * description : 制作普通咖啡
 */
public class Son implements Coffee {
    @Override
    public void buyCoffee() {
        System.out.println("儿子买咖啡");
    }
}
