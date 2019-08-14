package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:08
 * description : 懒汉式加同步锁
 * 优点：防止多个线程同时调用，从而避免单例被重复创建（还可以继续优化）
 * 缺点：每次访问都要进行线程同步（即 调用synchronized锁)，造成过多的同步开销（加锁 = 耗时、耗能）
 */
public class Singleton_4 {

    // 1. 类加载时，先不自动创建单例
    //  即，将单例的引用先赋值为 Null
    private static  Singleton_4 ourInstance  = null;

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private Singleton_4() {
    }

    // 写法一：3. 需要时才手动调用 newInstance（） 创建 单例
    public static synchronized Singleton_4 newInstance_1() {
        // 先判断单例是否为空，以避免重复创建
        if( ourInstance == null){
            ourInstance = new Singleton_4();
        }
        return ourInstance;
    }


    // 写法二：3. 需要时才手动调用 newInstance（） 创建 单例
    public static  Singleton_4 newInstance_2() {
        // 先判断单例是否为空，以避免重复创建
        //加入同步锁
        synchronized (Singleton_4.class){
            if( ourInstance == null){
                ourInstance = new Singleton_4();
            }
        }

        return ourInstance;
    }


}
