package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FlyweightPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 10:43
 * description : 用户类 作为网站的外部状态
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
