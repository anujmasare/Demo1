package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.TestBean;

@RestController
public class RestControllerIOCeg {

	TestBean testBean;
	@Autowired
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	TestBean testConstructor;
	@Autowired
	public RestControllerIOCeg(TestBean testConstructor) {
		this.testConstructor = testConstructor;
	}
	@Autowired
	TestBean autowiredBean;

	@RequestMapping("/beanInjection")
	public String test() {
		testBean.setName("fddddddddddddd");
		autowiredBean.setAge("99");
		testConstructor.setName("testConstructor");
		return autowiredBean.getAge()	+"hhhyyyy"+testBean.getName()+testConstructor.getName();
	}
	
	@Value("${TestBean.name}")
	private String retrunMsg;
	@RequestMapping("/default")
	public String test1() {
		return retrunMsg	+"hhhyyyy";
	}
	
	@Value("${spring.profiles.active}")
	private String profile;
	
	@Value("${msg}")
	private String msg;
	
	@RequestMapping("/getProfile")
	public String getActiveProfile() {
		return this.msg+""+this.profile;
	}
}
