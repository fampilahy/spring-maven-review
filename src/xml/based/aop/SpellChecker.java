package xml.based.aop;

public class SpellChecker {
	
	
	
	
	private String value;

	public String getValue() {
		System.out.println("SpellChecker.getValue()");
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public SpellChecker(){
		
	}

}
