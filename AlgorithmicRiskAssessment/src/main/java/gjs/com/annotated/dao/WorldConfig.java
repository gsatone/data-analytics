package gjs.com.annotated.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gjs.com.dao.HelloWorld;

@Configuration
public class WorldConfig {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
