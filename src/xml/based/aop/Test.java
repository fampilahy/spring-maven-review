package xml.based.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main (String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/based/aop/config.xml");
		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
		textEditor.getSpellChecker().getValue();
		

		
//		Printer printer  = (Printer) applicationContext.getBean("printer");
//		printer.print();
		
		
//		mail.google.com
		
	}
}