package custom.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {

	// custom event working with defautl spring event

	public static void main(String[] args) {

		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(Test.class);

		EventClassPublisher publisher = capp.getBean(EventClassPublisher.class);
		publisher.publish();

		ContextStoppedListener listener = capp.getBean(ContextStoppedListener.class);
		capp.stop();

	}

	@Bean
	EventClassPublisher getPublisher() {
		return new EventClassPublisher();
	}

	@Bean
	EventHandler getHandler() {
		return new EventHandler();
	}

	@Bean
	ContextStoppedListener getListener() {
		return new ContextStoppedListener();
	}

}
