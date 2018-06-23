package constructorbaseddependencyinjection.model;

public class TextEditor {
	
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}

}
