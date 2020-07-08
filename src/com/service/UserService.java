package com.service;

import com.dao.UserDao;

public class UserService {

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    private UserDao userdao;


    public void add(){
        System.out.println("service add.......");

//        UserDao userdao = new UserDaoImpl();
        userdao.update();

    }

}
