package conf.basado.java.con.aspecto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext acc = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		CalculatorService calc = acc.getBean(CalculatorService.class);
		calc.calculate(12, 12);
		
		
	}

}
