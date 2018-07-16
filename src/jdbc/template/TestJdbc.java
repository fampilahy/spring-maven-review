package jdbc.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc/template/conf.xml");
	User user = new User();
	
	user.setEmail("fampilahy@valueit.fr");
	user.setPass("Slirf1111");
	user.setLastName("AMPILAHY");
	user.setFirstName("Frelin");
	
	UserDAOImpl userDAOImpl  = (UserDAOImpl) applicationContext.getBean("userDAOImpl");
	userDAOImpl.createUser(user);
		
		
	}

}
