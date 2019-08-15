package com.study.duxiaodong.designpattern_java.DesignPattern.CreationalPattern.PrototypePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 14:11
 * description : 原型模式
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三",new School("东阳一中","吴宁东路5号"));

        Student student2 = student1.clone();
        student2.setName("李四");
        student2.setSchool(new School("东阳二中","吴宁西路8号"));

        Student student3 = student1.clone();
        student3.setName("王五");
        student3.setSchool(new School("东阳三中","吴宁西路100号"));

        System.out.println(student1);;

        System.out.println(student2);

        System.out.println(student3);

    }
}
