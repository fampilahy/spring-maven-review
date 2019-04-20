package pruebas.en.baso;

public class Text {

	private String text = "5";

	public Text() {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void print() {
		System.out.println("inside text mi valor es " + text);
	}

}
