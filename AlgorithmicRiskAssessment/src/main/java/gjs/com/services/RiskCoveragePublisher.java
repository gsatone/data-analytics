package gjs.com.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class RiskCoveragePublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		RiskCoverageEvent ce = new RiskCoverageEvent(this);
		publisher.publishEvent(ce);
	}
}
