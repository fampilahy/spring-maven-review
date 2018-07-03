package annotation.based.dependency.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){
		
		
		
		
		AbstractApplicationContext appCtxt = new ClassPathXmlApplicationContext("annotation/based/dependency/injection/conf.xml");
		TextEditor textEditor = (TextEditor) appCtxt.getBean("textEditor");
		Hello hello = (Hello) appCtxt.getBean("hello");
		
		System.out.println("====> "+hello.getTextEditor().getText());
	
	}

}
