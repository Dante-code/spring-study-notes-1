package com.test;

import com.enterprise.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean2 {
    @Test
    public void add(){
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean3.xml");

//        两个一样的
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp",Emp.class);
        emp.add();
    }
}
