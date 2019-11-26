package com.example.beanorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanorderApplication {


	@ConditionalOnBean(name = "myclass2")
	@Bean(name = "myclass1")
	public MyClass1 getClass1(){
		System.out.println("init myclass1");
		return new MyClass1();
	}

	@Bean(name = "myclass2")
	public MyClass2 getClass2(){
		System.out.println("init myclass2");
		return new MyClass2();
	}

	public static void main(String[] args) {
		SpringApplication.run(BeanorderApplication.class, args);
		new MyConfig().test();
	}

}
