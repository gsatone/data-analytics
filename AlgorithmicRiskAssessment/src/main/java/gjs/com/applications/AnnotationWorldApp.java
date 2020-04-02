package gjs.com.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gjs.com.annotated.dao.WorldConfig;
import gjs.com.dao.HelloWorld;

public class AnnotationWorldApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(WorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage1("I am good one");
		helloWorld.setMessage2("I am good 2");
		
		helloWorld.getMessage1();
		helloWorld.getMessage2();
	}
}
