package tx.declarative;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {

		AbstractApplicationContext app = new ClassPathXmlApplicationContext("tx/declarative/Beans.xml");

		StudentJDBCTemplate s = (StudentJDBCTemplate) app.getBean("studentJDBCTemplate");

		s.create("baba", 31, 2, 1987);
		s.create("nona", 31, 2, 1987);
		s.create("sosi", 31, 2, 1987);

		s.getStudents().stream().forEach(y -> System.out.println(y.toString()));

	}

}
