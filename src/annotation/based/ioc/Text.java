package annotation.based.ioc;

public class Text {

	private String text;

	private void init() {
		System.out.println("inside Text init");
	}

	private void destroy() {
		System.out.println("inside text destroy");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
	public Text(){
		
	}
	
	
}
