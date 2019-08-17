package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.CompositePattern.Case;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 18:15
 * description :子节点 - 财务部门
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(){

    }

    public FinanceDepartment(String name) {
        super(name);
    }

        @Override
    protected void add(Company company) {

    }

    @Override
    protected void romove(Company company) {

    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("*");
        }
        System.out.println(new String(sb) + this.getName() ) ;

    }
}
