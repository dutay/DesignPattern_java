package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.ObserverPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 15:08
 * description : 观察者
 */
public abstract class Observer {

    protected abstract void update(String message);

}

//具体观察者：A用户
class UserA extends Observer{
    @Override
    protected void update(String message) {
        System.out.println("用户A接收到了消息："+message);
    }
}

//具体观察者：B用户
class UserB extends Observer{
    @Override
    protected void update(String message) {
        System.out.println("用户B接收到了消息："+message);
    }
}

//具体观察者：C用户
class UserC extends Observer{
    @Override
    protected void update(String message) {
        System.out.println("用户C接收到了消息："+message);
    }
}

