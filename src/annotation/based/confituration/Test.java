package annotation.based.confituration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("annotation/based/confituration/config.xml");
		Text text = (Text) app.getBean("textBean");
		Screen screen = (Screen )app.getBean("screen");
		
		screen.print();
//		System.out.println("==> "+text.getText());
	}

}
