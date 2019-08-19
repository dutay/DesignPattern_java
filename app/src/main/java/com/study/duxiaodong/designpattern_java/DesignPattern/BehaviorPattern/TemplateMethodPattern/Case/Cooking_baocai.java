package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.TemplateMethodPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 14:24
 * description : 具体的类 辣炒手撕包菜
 */
public class Cooking_baocai extends Cooking {
    @Override
    protected void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    protected void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
