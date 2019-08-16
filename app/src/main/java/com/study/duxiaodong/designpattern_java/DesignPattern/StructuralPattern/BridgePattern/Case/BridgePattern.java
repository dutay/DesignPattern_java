package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.BridgePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 11:44
 * description :桥接模式
 */
public class BridgePattern  {

    public static void main(String[] args) {

        //创建可拓展桥接对象
        Abstractor abstractor = new RefinedAbstractor();

        //桥接具体的实现类A
        abstractor.setImplementor(new ConcreteImplementorA());

        abstractor.operation();

        //桥接具体的实现类B
        abstractor.setImplementor(new ConcreteImplementorB());


        abstractor.operation();
    }
}
