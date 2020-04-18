package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.bean.DepartmentConfigAttached;


@SpringBootApplication
@ComponentScan({"com.*"})
@EnableConfigurationProperties
@PropertySource("classpath:Configruation.properties")

public class SpringWebDemoApplication {

	public static void main(String[] args) {

		System.out.println("hhhh");
		ApplicationContext applicationContext =SpringApplication.run(SpringWebDemoApplication.class, args);
		//		
		//ApplicationContext applicationContext = SpringApplication.run(SpringWebDemoApplication.class, args);
		String  names[]=applicationContext.getBeanDefinitionNames();
		for(String name:names)
			System.out.println("aaa   "+name);

		DepartmentConfigAttached departmentBean = 		applicationContext.getBean(DepartmentConfigAttached.class);
		System.out.println(		departmentBean.getName()+"dddddddddddddddddddddddddd"+departmentBean.getFacultyMember());
		
		
  
		
	}

}
