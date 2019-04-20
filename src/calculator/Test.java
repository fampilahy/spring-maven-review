package calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(Test.class);
		cApp.start();

		// ApplicationContext app = new
		// AnnotationConfigApplicationContext(Test.class);
		CalculatorView aCalculatorView = (CalculatorView) cApp.getBean("view1");
		// CalculatorView aCalculatorView2 = (CalculatorView)
		// app.getBean("view1");
		CalculatorView aCalculatorView2 = (CalculatorView) cApp.getBean("view1");// here
																					// it
																					// will
																					// create
																					// 2
																					// instances
		aCalculatorView.setVisible(true);
		aCalculatorView2.setVisible(true);
	}

	@Bean(name = "view1")
	public CalculatorView getView() {
		return new CalculatorView();
	}

	@Bean(name = "view2")
	public CalculatorView getView2() {
		return new CalculatorView();
	}

	@Bean
	public CalculatorService getService() {
		return new CalculatorService();
	}

	@Bean
	ContextStartedListener getStartListener() {
		return new ContextStartedListener();
	}

	@Bean
	ContextStartedListener2 getStartListener2() {
		return new ContextStartedListener2();
	}

}
