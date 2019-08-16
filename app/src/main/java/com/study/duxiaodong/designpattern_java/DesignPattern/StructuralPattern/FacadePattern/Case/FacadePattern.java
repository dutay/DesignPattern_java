package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.FacadePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 10:18
 * description :外观模式
 */
public class FacadePattern {

    public static void main(String[] args) {

        //电视
        SubSystem_TV tv = new SubSystem_TV();
        //灯
        SubSystem_light light = new SubSystem_light();
        //空调
        SubSystem_airconditioning airconditioning = new SubSystem_airconditioning();


        //外观对象
        Facade facade = new Facade(airconditioning,light,tv);

        //起床
        facade.getUp();

        System.out.println("---------------------------------");
        //睡觉
        facade.sleep();
    }
}
