package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FlyweightPattern.Case;

import java.util.HashMap;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 10:48
 * description : 享元工厂 ：（管理网站的类）
 */
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteWebSite(key));
        }

        return pool.get(key);
    }

    //获得网站分类总数
    public void getWebSiteCount() {
        System.out.println("网站分类总数为："+pool.size());
    }
}
