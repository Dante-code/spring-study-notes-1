package com.enterprise;

public class Emp {
    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
//级联赋值需要get方法
    public Dept getDept() {
        return dept;
    }

    private Dept dept;
    private String ename,gender;

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept.toString());

    }
}
