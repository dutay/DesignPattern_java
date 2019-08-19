package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FlyweightPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 10:51
 * description : 享元模式调用类
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite a = factory.getWebSiteCategory("产品展示");
        a.use(new User("张三"));

        WebSite b = factory.getWebSiteCategory("产品展示");
        b.use(new User("李四"));

        WebSite c = factory.getWebSiteCategory("产品展示");
        c.use(new User("王五"));

        WebSite x = factory.getWebSiteCategory("帮助中心");
        x.use(new User("Gavin"));

        WebSite y = factory.getWebSiteCategory("帮助中心");
        y.use(new User("John"));

        WebSite z = factory.getWebSiteCategory("帮助中心");
        z.use(new User("Cain"));

        factory.getWebSiteCount();


    }
}
