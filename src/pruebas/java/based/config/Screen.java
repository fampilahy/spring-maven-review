package pruebas.java.based.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Screen {

	@Autowired
	private Text text;

	public void print() {
		System.out.println("inside screen");
		text.print();
		System.out.println("----------------------------");

	}

	public Screen() {

	}
}
