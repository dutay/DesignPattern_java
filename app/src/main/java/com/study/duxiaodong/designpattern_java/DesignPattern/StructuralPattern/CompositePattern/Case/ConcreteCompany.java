package com.study.duxiaodong.designpattern_java.DesignPattern.StructuralPattern.CompositePattern.Case;

import java.util.ArrayList;
import java.util.List;

/**
 * author : gavin_du
 * email : 1033784386@qq.com
 * date : 2019/8/16 18:06
 * description : 具体的公司 子节点
 */
public class ConcreteCompany extends Company {

    private List<Company> companyList;

    public ConcreteCompany(){
        this("总公司");
    }

    public ConcreteCompany(String name) {
        super(name);
        if (companyList==null){
            companyList = new ArrayList<>();
        }

    }

    @Override
    protected void add(Company company) {
        if (company!=null){
            companyList.add(company);
        }
    }

    @Override
    protected void romove(Company company) {
        if (company!=null&&companyList.contains(company)){
            companyList.remove(company);
        }
    }

    @Override
    protected void display(int depth) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company c : companyList) {
            c.display(depth + 2);
        }

    }
}
