package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:30
 * description : 帮运工人类
 */
public class Carrier {

    public StoreHouse mStoreHouse;
    public Carrier(StoreHouse storeHouse){
        mStoreHouse = storeHouse;
    }
    //搬货进仓库
    public void MoveIn(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity()+i);
    }
    //搬货出仓库
    public void MoveOut(int i){
        mStoreHouse.setQuantity(mStoreHouse.getQuantity()-i);
    }
}
