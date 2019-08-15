package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.SingletonPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:31
 * description : 工人帮仓库（仓库只有一个）
 */
public class Test {

    public static void main(String[] args) {
        StoreHouse mStoreHouse1 = StoreHouse.getInstance();
        StoreHouse mStoreHouse2 = StoreHouse.getInstance();
        Carrier Carrier1 = new Carrier(mStoreHouse1);
        Carrier Carrier2 = new Carrier(mStoreHouse2);

        System.out.println("两个是不是同一个？");

        if(mStoreHouse1.equals(mStoreHouse2)){
            System.out.println("是同一个");
        }else {
            System.out.println("不是同一个");
        }
        //搬运工搬完货物之后出来汇报仓库商品数量
        Carrier1.MoveIn(30);
        System.out.println("仓库商品余量："+Carrier1.mStoreHouse.getQuantity());
        Carrier2.MoveOut(50);
        System.out.println("仓库商品余量："+Carrier2.mStoreHouse.getQuantity());
    }
}
