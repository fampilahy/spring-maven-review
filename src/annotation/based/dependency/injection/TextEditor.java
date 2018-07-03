package annotation.based.dependency.injection;

public class TextEditor {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextEditor() {

	}
	
	public void start(){
		System.out.println("we are initializing an object TextEditor");
	}
}
