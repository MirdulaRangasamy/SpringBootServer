package com.exterro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootServerApplication {
	
	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			
			public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*").allowedOrigins("http://localhost:9090");
			}
			
		};
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootServerApplication.class, args);
		
	}

}
