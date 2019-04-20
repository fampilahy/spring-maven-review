package custom.event;

import org.springframework.context.ApplicationListener;

public class EventHandler implements ApplicationListener<PersonalizadoEvento> {

	@Override
	public void onApplicationEvent(PersonalizadoEvento event) {
		event.publicacionPersonalizado();

	}
	
	
	
	

}
