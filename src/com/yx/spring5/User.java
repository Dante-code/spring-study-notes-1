package com.yx.spring5;

public class User {

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String bname;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String author;
    public static void main(String[] args) {

    }

    public void testdemo(){
        System.out.println(bname+"::"+author);
    }
    public void add(){
        System.out.println("add.......");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String address;


}
