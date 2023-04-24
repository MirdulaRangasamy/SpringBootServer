package com.exterro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Apple getApple() {
		return new Apple();
	}
	
	@Bean
	public Orange getOrange() {
		return new Orange();
	}
	
	@Bean
	public Demo getDemo() {
		return new Demo();
	}
}
