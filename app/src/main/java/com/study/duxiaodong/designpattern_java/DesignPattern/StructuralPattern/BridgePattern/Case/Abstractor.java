package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.BridgePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 11:05
 * description : 桥接类
 */
public abstract class Abstractor {
    Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }


    protected void operation(){
        implementor.operation();
    }
}
