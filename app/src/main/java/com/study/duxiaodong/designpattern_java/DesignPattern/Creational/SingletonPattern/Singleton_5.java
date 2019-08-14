package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.SingletonPattern;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/14 15:13
 * description : 懒汉式 双重校验锁
 * 优点：防止多个线程同时调用，从而避免单例被重复创建
 * 缺点：实现复杂 = 多种判断，易出错
 */
class Singleton_5 {
    private static  Singleton_5 ourInstance  = null;

    private Singleton_5() {
    }

    public static  Singleton_5 newInstance() {
        // 加入双重校验锁
        // 校验锁1：第1个if
        if( ourInstance == null){  // ①
            synchronized (Singleton_5.class){ // ②
                // 校验锁2：第2个 if
                if( ourInstance == null){
                    ourInstance = new Singleton_5();
                }
            }
        }
        return ourInstance;
    }
}

// 说明
// 校验锁1：第1个if
// 作用：若单例已创建，则直接返回已创建的单例，无需再执行加锁操作
// 即直接跳到执行 return ourInstance

// 校验锁2：第2个 if
// 作用：防止多次创建单例问题
// 原理
// 1. 线程A调用newInstance()，当运行到②位置时，此时线程B也调用了newInstance()
// 2. 因线程A并没有执行instance = new Singleton();，此时instance仍为空，因此线程B能突破第1层 if 判断，运行到①位置等待synchronized中的A线程执行完毕
// 3. 当线程A释放同步锁时，单例已创建，即instance已非空
// 4. 此时线程B 从①开始执行到位置②。此时第2层 if 判断 = 为空（单例已创建），因此也不会创建多余的实例

