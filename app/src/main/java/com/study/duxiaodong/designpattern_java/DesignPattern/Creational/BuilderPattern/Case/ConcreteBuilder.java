package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.BuilderPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 11:23
 * description : 具体的建造者：装机人员
 */
public class ConcreteBuilder extends Builder {
    //创建具体的产品实例
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.add("组装CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.add("组装主板");
    }

    @Override
    public void buildHD() {
        computer.add("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
