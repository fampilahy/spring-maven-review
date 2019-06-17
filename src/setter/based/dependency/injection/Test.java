package setter.based.dependency.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext(
				"setter/based/dependency/injection/conf.xml");
		Printer printer = (Printer) ap.getBean("printer");
		System.out.println("BBBB ===> " + printer.getTextManager().getStr());
	}

}
