package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FacadePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 10:12
 * description : 外观类 组合这个接口
 */
public class Facade {

    private SubSystem_airconditioning airconditioning;
    private SubSystem_light light;
    private SubSystem_TV tv;

    public Facade(SubSystem_airconditioning airconditioning,SubSystem_light light,SubSystem_TV tv){
        this.airconditioning = airconditioning;
        this.light = light;
        this.tv = tv;
    }

    public void getUp(){
        System.out.println("起床看电视");
        airconditioning.on();
        light.on();
        tv.on();
    }

    public void sleep(){
        System.out.println("关灯睡觉");
        airconditioning.off();
        light.off();
        tv.off();

    }



}
