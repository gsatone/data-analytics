package gjs.com.services;

import org.springframework.context.ApplicationListener;

public class RiskCoverageEventHandler implements ApplicationListener<RiskCoverageEvent>{

	public void onApplicationEvent(RiskCoverageEvent event) {
		System.out.println(event.toString());
		
	}

}
