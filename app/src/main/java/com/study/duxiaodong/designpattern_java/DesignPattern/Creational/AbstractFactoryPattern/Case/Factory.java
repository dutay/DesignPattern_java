package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.AbstractFactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 17:57
 * description :
 */
public abstract class Factory  {
    //生产容器
    public abstract AbstractProduct createContainerProduct();
    //生产模具
    public abstract AbstractProduct createMouldProduct();
}

/**
 * 工厂A
 */
class FactoryA extends Factory{

    @Override
    public AbstractProduct createContainerProduct() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct createMouldProduct() {
        return new MouldProductA();
    }
}


/**
 * 工厂B
 */
class FactoryB extends Factory{

    @Override
    public AbstractProduct createContainerProduct() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct createMouldProduct() {
        return new MouldProductB();
    }
}



