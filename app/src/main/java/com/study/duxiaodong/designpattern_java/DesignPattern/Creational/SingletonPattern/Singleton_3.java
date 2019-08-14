package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 14:58
 * description : 懒汉式单例（非线程安全）
 * 原因: 可能存在多个线程并发调用 newInstance()方法,从而重复创建单例对象
 * 具体事例： 一个线程A执行到 newInstance（）时，没有获取到对象（因为对象初始化需要时间），此时，
 * 第二个线程B也在执行，执行到if语句时，判断条件为真，于是继续执行newInstance（），最终A，B线程同时获得
 * 了一个单例对象，在内存中就出现了两个单例类的对象，造成单例模式失效
 */
public class Singleton_3 {

    // 1. 类加载时，先不自动创建单例
    //  即，将单例的引用先赋值为 Null
    private static  Singleton_3 ourInstance  = null;

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private Singleton_3() {
    }

    // 3. 需要时才手动调用 newInstance（） 创建 单例
    public static  Singleton_3 newInstance() {
        // 先判断单例是否为空，以避免重复创建
        if( ourInstance == null){
            ourInstance = new Singleton_3();
        }
        return ourInstance;
    }




}
