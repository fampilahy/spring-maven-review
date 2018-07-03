package xml.based.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main (String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/based/aop/config.xml");
		
		Transaction transaction = (Transaction) applicationContext.getBean("transaction");
		
		System.out.println("transaction is "+transaction.getDescription());
		
		System.out.println("-----------");
		transaction.printException();
		System.out.println("-----------");
		System.out.println("transaction is "+transaction.getId());
		
	}
	
}
