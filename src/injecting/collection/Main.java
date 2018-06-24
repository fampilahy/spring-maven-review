package injecting.collection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"injecting/collection/conf.xml");
		Hello hello = (Hello) abstractApplicationContext.getBean("hello");
		System.out.println("   ==> " + hello.toString());

		List values = hello.getValues();

		for (Object object : values) {

			if (object.getClass() == String.class) {
				System.out.println("   " + object.getClass() + "  -  " + object);
			} else if (object instanceof Address) {

				System.out.println("   " + object.getClass() + "  -  " + ((Address) object).getText());
			} else if (object instanceof Email) {

				System.out.println("   " + object.getClass() + "  -  " + ((Email) object).getText());

			}

		}
	}
}