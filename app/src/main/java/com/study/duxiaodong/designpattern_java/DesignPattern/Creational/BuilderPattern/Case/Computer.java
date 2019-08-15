package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.BuilderPattern.Case;

import java.util.ArrayList;
import java.util.List;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 11:14
 * description : 具体产品类（电脑）
 */
class Computer {

    //电脑组件的集合
    private List<String> parts = new ArrayList<>();

    //将组件装到电脑里
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (String part : parts){
            System.out.println("组件"+part+"装好了");
        }
        System.out.println("电脑组装完成，请验收！");
    }

}
