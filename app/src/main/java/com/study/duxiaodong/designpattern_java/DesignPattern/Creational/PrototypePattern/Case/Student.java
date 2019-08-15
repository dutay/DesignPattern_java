package com.study.duxiaodong.designpattern_java.DesignPattern.Creational.PrototypePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/15 14:01
 * description : 学生类（拷贝对象）
 */
public class Student implements Cloneable {

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }

    //姓名 基本类型或String
    private String name;

    //引用类型 （对象）
    private School school;

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    protected Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}



//进行深拷贝
class School implements Cloneable{

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String name;

    private String address;

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address == null ? "" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected School clone()  {


        School school = null;
        try {
            school = (School) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return school;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
