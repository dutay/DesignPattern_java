package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.ObserverPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 15:24
 * description : 观察者模式
 */
public class Client  {
    public static void main(String[] args) {

        //用户A
        UserA userA = new UserA();
        //用户B
        UserB userB = new UserB();
        //用户C
        UserC userC = new UserC();

        //发布者
        ConcreteSubject subject = new ConcreteSubject();

        //订阅用户A
        subject.registerObserver(userA);

        //订阅用户B
        subject.registerObserver(userB);

        //订阅用户C
        subject.registerObserver(userC);





        //发布者发布消息给订阅者
        subject.send("今晚聚餐");
    }
}
