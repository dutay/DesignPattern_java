package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:19
 * description : 静态内部类实现单例
 * 优点：根据 静态内部类 的特性，同时解决了按需加载、线程安全的问题，同时实现简洁（推荐使用）
 */
public class Singleton_6 {
    //创建静态内部类
    private static class Instance{
        //在静态内部类里创建单例
        private static Singleton_6 instance = new Singleton_6();
    }
    //构造函数私有化
    private Singleton_6(){}

    //延迟加载 按需创建
    public static Singleton_6 getInstance(){
        return Instance.instance;
    }
}
