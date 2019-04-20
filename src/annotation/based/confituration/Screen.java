package annotation.based.confituration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class Screen {

	@Autowired
	private Text text;

	public Screen() {

	}

	public void print() {
		System.out.println("valor inside scree through autowiring " + this.text.getText());
	}

	@PostConstruct
	public void init() {
		System.out.println("initialize Screen");
	}

}
