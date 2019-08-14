package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 14:23
 * description : 懒汉式单例
 * principle : 依赖 JVM类加载机制，保证单例只会被创建1次，即 线程安全
 * scene :除了初始化单例类时 即 创建单例外，继续延伸出来的是：单例对象 要求初始化速度快 & 占用内存小
 */
public class Singleton_1 {

    // 1. 加载该类时，单例就会自动被创建
    private static  Singleton_1 ourInstance  = new  Singleton_1();

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private Singleton_1() {
    }

    // 3. 通过调用静态方法获得创建的单例
    public static  Singleton_1 newInstance() {
        return ourInstance;
    }
}
