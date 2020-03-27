package gjs.com.applications;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjs.com.dao.HelloIndia;
import gjs.com.dao.HelloWorld;
import gjs.com.dao.RiskCoverageImpl;

public class InheritanceApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-rgf-config.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		RiskCoverageImpl riskCoverA = (RiskCoverageImpl) context.getBean("RiskCoverageBean");
		
		riskCoverA.setMessage("I am risk cover");
		riskCoverA.getMessage();
		
		context.close();
		

	}
}
