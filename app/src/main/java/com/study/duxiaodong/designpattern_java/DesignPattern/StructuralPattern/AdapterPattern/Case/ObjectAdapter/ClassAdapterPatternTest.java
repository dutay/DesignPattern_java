package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.AdapterPattern.Case.ObjectAdapter;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 15:52
 * description : 类适配器模式测试
 */
public class ClassAdapterPatternTest {
    public static void main(String[] args) {

        //适配器对象
        Adapter110V adapter110V = new Adapter110V(new PowerPort110V());

        //将110V的电压装换为220V
        adapter110V.Convert_220v();

        //只有提供220V电压才能工作的机器正常工作
        new Machine().work();
    }
}
