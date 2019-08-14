package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SimpleFactoryPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 16:11
 * description : 抽象产品类（定义公共接口）
 */
public abstract class Product {

   public abstract void show();
}

/**
 * 具体产品
 */
class Product_A extends Product{

    @Override
    public void show() {
        System.out.println("生产A产品。");
    }
}

/**
 * 具体产品B
 */
class Product_B extends Product{

    @Override
    public void show() {
        System.out.println("生产B产品。");
    }
}

/**
 * 具体产品C
 */
class Product_C extends Product{

    @Override
    public void show() {
        System.out.println("生产C产品。");
    }
}

/**
 * 简单工厂类
 */
class Factory {

    public static Product createProduct(String productName){
        Product product;
        switch (productName){
            case "A":
               product =  new Product_A();
               break;
            case "B":
                product = new Product_B();
                break;
            case "C":
                product = new  Product_C();
                break;
            default:
                product = new Product_A();
        }
        return product;
    }


}
