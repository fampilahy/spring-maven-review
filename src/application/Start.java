package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Start {

	@Autowired
	private PrintToScreenService printer;

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Start.class);
		Start start = (Start) app.getBean("getStart");
		start.print("5");

	}

	public void print(String value) {
		printer.print(value);
	}

	@Bean
	PrintToScreenService getPrinter() {
		return new PrintToScreenService();
	}

	@Bean
	Start getStart() {
		return new Start();
	}

}
