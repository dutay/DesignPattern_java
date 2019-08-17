package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.CompositePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 18:21
 * description :组合模式（公司的部门体系结构）
 */
public class CompositePattern {

    public static void main(String[] args) {
        ConcreteCompany concreteCompany = new ConcreteCompany("北京总公司");
        concreteCompany.add(new FinanceDepartment("总公司财务部门"));
        concreteCompany.add(new HRDepartment("总公司人力资源部门"));

        ConcreteCompany comp_shagnhai = new ConcreteCompany("上海分公司");
        comp_shagnhai.add(new HRDepartment("上海分人力资源"));
        comp_shagnhai.add(new FinanceDepartment("上海分财务"));
        concreteCompany.add(comp_shagnhai);


        ConcreteCompany comp_hangzhou = new ConcreteCompany("杭州分公司");
        comp_hangzhou.add(new HRDepartment("杭州分人力资源"));
        comp_hangzhou.add(new FinanceDepartment("杭州分财务"));
        concreteCompany.add(comp_hangzhou);

        ConcreteCompany comp_shandong = new ConcreteCompany("山东分公司");
        comp_shandong.add(new HRDepartment("山东分人力资源"));
        comp_shandong.add(new FinanceDepartment("山东分财务"));
        concreteCompany.add(comp_shandong);



        concreteCompany.display(3);


    }
}
