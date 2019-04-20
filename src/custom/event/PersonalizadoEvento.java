package custom.event;

import org.springframework.context.ApplicationEvent;

public class PersonalizadoEvento extends ApplicationEvent {

	public PersonalizadoEvento(Object source) {
		super(source);
	}

	public void publicacionPersonalizado() {
		System.err.println("Evento personalizado.");
	}

}
