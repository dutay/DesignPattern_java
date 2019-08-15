package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.SingletonPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:27
 * description : 创建单例仓库类
 */
public class StoreHouse {
    //仓库商品数量
    private int quantity = 100;

    //创建静态内部类
    private static class Instance{
        //自己在内部类里实例化
        private static StoreHouse ourInstance  = new StoreHouse();
    }

    //让外部通过调用getInstance()方法来返回唯一的实例。
    public static StoreHouse getInstance() {
        return Instance.ourInstance;
    }

    //封闭构造函数
    private StoreHouse() {
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

