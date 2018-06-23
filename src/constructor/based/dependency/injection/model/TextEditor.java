package constructor.based.dependency.injection.model;

public class TextEditor {
	
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	
}
