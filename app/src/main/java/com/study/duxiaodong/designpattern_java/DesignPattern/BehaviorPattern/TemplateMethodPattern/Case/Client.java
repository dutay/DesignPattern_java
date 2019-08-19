package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.TemplateMethodPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 14:27
 * description : 模板方法模式
 */
public class Client {

    public static void main(String[] args) {


        Cooking cooking_baocai = new Cooking_baocai();

        //辣炒包菜
        cooking_baocai.cookProcess();

        System.out.println("----------------------");


        Cooking cooking_caixin = new Cooking_caixin();

        //蒜蓉菜心
        cooking_caixin.cookProcess();
    }
}
