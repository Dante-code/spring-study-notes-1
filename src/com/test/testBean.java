package com.test;

import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    @Test
    public void testAdd(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService",UserService.class);

        userService.add();
    }
}
