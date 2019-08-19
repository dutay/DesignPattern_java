package com.study.duxiaodong.designpattern_java.DesignPattern.BehaviorPattern.StrategyPattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/19 11:34
 * description : 策略模式
 */
public class Client {

    public static void main(String[] args) {
        Context_Sales mSalesMan ;

        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan =  new Context_Sales("A");
        mSalesMan.SalesManShow();


        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan =  new  Context_Sales("B");
        mSalesMan.SalesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan =  new Context_Sales("C");
        mSalesMan.SalesManShow();

    }
}
