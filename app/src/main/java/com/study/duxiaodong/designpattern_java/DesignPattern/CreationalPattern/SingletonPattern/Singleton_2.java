package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 14:55
 * description : 枚举类单例
 * principle : 根据枚举类型的下述特点，满足单例模式所需的 创建单例、线程安全、实现简洁的需求
 */
public enum Singleton_2 {
    //定义1个枚举的元素，即为单例类的1个实例
    INSTANCE;

    // 隐藏了1个空的、私有的 构造方法
    // private Singleton_2 () {}

}

    // 获取单例的方式：
    //Singleton_2 singleton = Singleton_2.INSTANCE;
