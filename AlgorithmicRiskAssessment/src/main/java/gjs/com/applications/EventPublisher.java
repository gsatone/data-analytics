package gjs.com.applications;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjs.com.services.RiskCoveragePublisher;

public class EventPublisher {
public static void main(String[] args) {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-rgf-config.xml");
	RiskCoveragePublisher rcvp = (RiskCoveragePublisher) context.getBean("riskEventPublisher");
	rcvp.publish();
	rcvp.publish();
}
}
