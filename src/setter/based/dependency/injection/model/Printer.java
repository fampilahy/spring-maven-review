package setter.based.dependency.injection.model;

public class Printer {
	
	TextManager textManager ;

	
	
	public Printer() {
		super();
	}

	public TextManager getTextManager() {
		return textManager;
	}

	public void setTextManager(TextManager textManager) {
		this.textManager = textManager;
	}
	
	

}
