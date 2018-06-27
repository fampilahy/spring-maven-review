package annotation.based.dependency.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){
		
		
		
		
		AbstractApplicationContext appCtxt = new ClassPathXmlApplicationContext("annotation/based/dependency/injection/conf.xml");
		TextEditor textEditor = (TextEditor) appCtxt.getBean("textEditor");
		
		System.out.println("====> "+textEditor.getText());
	
	}

}
