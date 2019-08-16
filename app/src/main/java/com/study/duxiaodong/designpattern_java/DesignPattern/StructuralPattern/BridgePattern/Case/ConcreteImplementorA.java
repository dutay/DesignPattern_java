package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.BridgePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 11:01
 * description : 具体的实现类A
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operation() {
        System.out.println("this is concreteImplementorA's operation...");
    }
}

//具体的实现类B
class ConcreteImplementorB implements Implementor{

    @Override
    public void operation() {
        System.out.println("this is concreteImplementorB's operation...");
    }
}
