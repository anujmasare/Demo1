package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "department")
public class DepartmentConfigAttached {
	//@Value("${department.name}")
	public String name;
	//@Value("${department.faculty_member}")
	public String facultyMember;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFacultyMember() {
		return facultyMember;
	}
	public void setFacultyMember(String facultyMember) {
		this.facultyMember = facultyMember;
	}


}
