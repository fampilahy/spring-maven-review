package constructor.based.dependency.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args){
		
		
		AbstractApplicationContext appCtxt = new ClassPathXmlApplicationContext("constructor/based/dependency/injection/config.xml");
		TextEditor txtEditr = (TextEditor)appCtxt.getBean("textEditor");
		
		System.out.println("aaa => "+txtEditr.getSpellChecker().getStr());
		
	}
}
