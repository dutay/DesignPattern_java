package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.FactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 16:49
 * description :抽象工厂类
 */
public abstract class Factory {
    //抽象创建产品对象
    public abstract Product createProduct();

}

/**
 * A工厂
 */
class Factory_A extends Factory{

    @Override
    public Product createProduct() {
        return new Product_A();
    }
}

/**
 * B工厂
 */
class Factory_B extends Factory{

    @Override
    public Product createProduct() {
        return new Product_B();
    }
}

/**
 * C工厂
 */
class Factory_C extends Factory{

    @Override
    public Product createProduct() {
        return new Product_C();
    }
}
