package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;

@Configuration
public class RootAppContext {

	@Bean
	@ApplicationScope
	public DataBean1 applicationBean1() {
		return new DataBean1();
	}
	
	@Bean("applicationBean2")
	@ApplicationScope
	public DataBean2 applicationBean2() {
		return new DataBean2();
	}
}
