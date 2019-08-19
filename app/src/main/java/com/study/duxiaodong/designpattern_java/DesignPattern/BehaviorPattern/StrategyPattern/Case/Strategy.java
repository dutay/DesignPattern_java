package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.StrategyPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 11:30
 * description : 策略类
 */
public abstract class Strategy {

    public abstract void show();
}

//为春节准备的促销活动A
class StrategyA extends Strategy{

    @Override
    public void show() {
        System.out.println("为春节准备的促销活动A");
    }
}

//为中秋节准备的促销活动B
class StrategyB extends Strategy{

    @Override
    public void show() {
        System.out.println("为中秋节准备的促销活动B");
    }
}

//为圣诞节准备的促销活动C
class StrategyC extends Strategy{

    @Override
    public void show() {
        System.out.println("为圣诞节准备的促销活动C");
    }
}

