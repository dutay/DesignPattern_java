package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.CompositePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 18:04
 * description :抽象类（公司）定义一些基本功能
 */
public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void romove(Company company);

    protected abstract void display(int depth);


}
