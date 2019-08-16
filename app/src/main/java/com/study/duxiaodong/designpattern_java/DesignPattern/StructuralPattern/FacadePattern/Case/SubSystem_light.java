package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FacadePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 10:06
 * description : 各个子系统
 */
public class SubSystem_light {

    public void on(){
        System.out.println("开灯");
    }

    public void off(){
        System.out.println("关灯");
    }

}

class SubSystem_TV{
    public void on(){
        System.out.println("开电视");
    }

    public void off(){
        System.out.println("关电视");
    }
}

class SubSystem_airconditioning{
    public void on(){
        System.out.println("开空调");
    }

    public void off(){
        System.out.println("关空调");
    }
}

