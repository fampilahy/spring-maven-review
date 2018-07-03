package conf.on.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext apctxt = new AnnotationConfigApplicationContext(Config.class);
//		apctxt.register(Config.class);
//		apctxt.refresh();
		
		
		SpellChecker spellChecker = apctxt.getBean(SpellChecker.class);
		spellChecker.setText("hihihihi");
		System.out.println("=== > "+spellChecker.getText());
		spellChecker.setText("Bonjour ");
		
		
		System.out.println("=== > "+spellChecker.getText());
		
		TextEditor textEditor = apctxt.getBean(TextEditor.class);
		spellChecker = textEditor.getSpellChecker();
		spellChecker.setText("bboooooo");
		System.out.println("=== > "+spellChecker.getText());
		
	}

}
