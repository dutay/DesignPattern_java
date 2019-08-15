package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.AdapterPattern.Case.ObjectAdapter;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 15:39
 * description :适配器类 将110V的电压转换为220V来使用
 */
public class Adapter110V  implements Target {

    private PowerPort110V powerPort110V;

    //对象适配
    public Adapter110V(PowerPort110V powerPort110V){
        this.powerPort110V = powerPort110V;
    }


    @Override
    public void Convert_220v() {
        this.powerPort110V.output_110V();
    }


}
