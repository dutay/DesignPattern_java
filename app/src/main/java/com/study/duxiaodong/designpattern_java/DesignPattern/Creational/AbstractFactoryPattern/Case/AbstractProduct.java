package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.AbstractFactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 17:52
 * description :抽象产品族类
 */
public abstract class AbstractProduct {
    public abstract void show();
}


//容器产品抽象类
abstract class ContainerProduct extends AbstractProduct{

}

//模具产品抽象类
abstract class MouldProduct extends AbstractProduct{

}

//容器产品A类
class ContainerProductA extends ContainerProduct{
    @Override
    public void show() {
        System.out.println("生产出了容器产品A");

    }
}

//容器产品B类
class ContainerProductB extends ContainerProduct{

    @Override
    public void show() {
        System.out.println("生产出了容器产品B");

    }
}

//模具产品A类
class MouldProductA extends MouldProduct{

    @Override
    public void show() {
        System.out.println("生产出了模具产品A");
    }
}

//模具产品B类
class MouldProductB extends MouldProduct{
    @Override
    public void show() {
        System.out.println("生产出了模具产品B");
    }
}

