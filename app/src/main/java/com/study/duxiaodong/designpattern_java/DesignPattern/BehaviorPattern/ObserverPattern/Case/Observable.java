package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.ObserverPattern.Case;

import java.util.ArrayList;
import java.util.List;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 15:12
 * description :被观察者
 */
public abstract class Observable {

    //观察者列表
    public List<Observer> list = new ArrayList<>();

    //订阅观察者
    public void registerObserver(Observer observer){
        list.add(observer);
    };

    //取消订阅观察者
    public void removeObserver(Observer observer){
        list.remove(observer);
    };

    public abstract void notifyObserver(String message);
}
