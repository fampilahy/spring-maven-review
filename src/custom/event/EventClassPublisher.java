package custom.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventClassPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher applicationEventPublisher;

	@Autowired
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publish() {
		PersonalizadoEvento pe = new PersonalizadoEvento(this);
		applicationEventPublisher.publishEvent(pe);
	}

}
