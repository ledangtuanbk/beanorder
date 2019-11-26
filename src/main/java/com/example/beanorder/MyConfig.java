package com.example.beanorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author tledang
 */
@Configuration
public class MyConfig {
    @Autowired
    MyClass1 myClass1;

    @Autowired
    MyClass2 myClass2;

    void test(){
        System.out.println("check class 1");
        System.out.println(myClass1==null);
        System.out.println("check class 2");
        System.out.println(myClass2==null);
    }
}
