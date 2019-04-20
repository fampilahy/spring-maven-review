package pruebas.en.baso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext app = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Screen scree = (Screen) app.getBean(Screen.class);
		scree.print();
		Text text = app.getBean(Text.class);
		text.print();
		

	}

}
