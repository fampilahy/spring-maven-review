package tx.declarative;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {

		AbstractApplicationContext app = new ClassPathXmlApplicationContext("tx/declarative/Beans.xml");

		// Note that in declarative tx managment, we should declare the interface for the aop
		StudentJDBCTemplate s = (StudentJDBCTemplate) app.getBean("studentJDBCTemplate");
		
		// or say aop to focus on extending class on bean : <aop:config proxy-target-class="true">

		s.create("nini", 31, 2, 1987);
		s.create("nunu", 31, 2, 1987);
		s.create("nene", 31, 2, 1987);

		s.getStudents().stream().forEach(y -> System.out.println(y.toString()));

	}

}
