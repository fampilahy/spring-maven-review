import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ca.springmaven.fr.Home;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		AbstractApplicationContext appCtxt = new ClassPathXmlApplicationContext("springMaven.xml");
		Home home = (Home) appCtxt.getBean("home");
		System.out.println("City " + home.getCity());
		System.out.println("Number " + home.getNumber());
	}
}