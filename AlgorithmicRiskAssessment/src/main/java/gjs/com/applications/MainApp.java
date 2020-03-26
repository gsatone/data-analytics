package gjs.com.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjs.com.dao.RiskCoverageImpl;
import gjs.com.dao.SingletonBean;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		SingletonBean objA = (SingletonBean) context.getBean("singletonBean");
		
		objA.setMessage("I am object A");
		objA.getMessage();
		
		SingletonBean objB = (SingletonBean) context.getBean("singletonBean");
		objB.getMessage();
		
		RiskCoverageImpl riskCoverA = (RiskCoverageImpl) context.getBean("RiskCoverageBean");
		
		riskCoverA.setMessage("I am risk cover");
		riskCoverA.getMessage();
		
		RiskCoverageImpl riskCoverB = (RiskCoverageImpl) context.getBean("RiskCoverageBean");
		riskCoverB.getMessage();
		
		context.registerShutdownHook();
		
		
		
	}
}
