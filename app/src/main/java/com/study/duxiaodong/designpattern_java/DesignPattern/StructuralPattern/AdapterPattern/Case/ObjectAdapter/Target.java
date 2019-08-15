package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.AdapterPattern.Case.ObjectAdapter;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 15:36
 * description : 目标接口
 */
public interface Target {
    //将110V转换输出220V（原有插头（Adaptee）没有的）
    void Convert_220v();
}
