package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.ObserverPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 15:15
 * description : 具体的被观察者（发布者）
 */
public class ConcreteSubject extends Observable {


    @Override
    public void notifyObserver(String message) {
        for (Observer observer : list){
            observer.update(message);
        }
    }

    //发布新消息，通知观察者
    public void send(String message){

        notifyObserver(message);
    }


}
