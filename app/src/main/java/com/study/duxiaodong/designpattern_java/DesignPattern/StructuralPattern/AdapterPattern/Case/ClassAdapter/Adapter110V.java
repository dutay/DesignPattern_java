package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.AdapterPattern.Case.ClassAdapter;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 15:39
 * description :适配器类 将110V的电压转换为220V来使用
 */
public class Adapter110V extends PowerPort110V implements Target{


    @Override
    public void Convert_220v() {

        output_110V();
    }
}
