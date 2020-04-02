package gjs.com.services;

import org.springframework.context.ApplicationEvent;

public class RiskCoverageEvent extends ApplicationEvent{

	public RiskCoverageEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return "RiskCoverageEvent [source=" + source + "]";
	}
	

}
