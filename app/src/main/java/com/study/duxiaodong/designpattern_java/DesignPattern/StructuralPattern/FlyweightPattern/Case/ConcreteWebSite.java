package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FlyweightPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 10:40
 * description : 具体的享元类 （具体的网站）
 */
public class ConcreteWebSite extends WebSite {


    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类："+name+",用户："+user.getName());
    }
}
