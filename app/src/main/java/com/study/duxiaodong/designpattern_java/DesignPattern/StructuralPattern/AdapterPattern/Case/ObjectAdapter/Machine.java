package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.AdapterPattern.Case.ObjectAdapter;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 15:53
 * description : 只有提供220V电压才能工作的机器
 */
public class Machine {

    public void work(){
        System.out.println("提供了220V，机器正常工作");
    }
}
