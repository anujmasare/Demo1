package com.simple;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfilerEx {


	ProfilerEx(){}
	@Bean("profilerExNew")
	@Profile("dev")
	public ProfilerEx test() {
		return new ProfilerEx("DEV",8080);
	}
	
//	public DataSource getDatasourc() {
//		return new DataSource("",9090);
//	}
	
	@Bean("profilerExNew")
	@Profile("prod")
	public ProfilerEx prod() {
		return new ProfilerEx("Prod",9090);
	}
	
	
	private String name;
	private int port;
	
	ProfilerEx(String name,int port){
		this.name=name;
		this.port =port;
	}
	
	@Override
	public String toString() {
		return "ProfilerEx [name=" + name + ", port=" + port + "]";
	}
}
