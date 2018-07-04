package xml.based.aop;

public class TextEditor {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		System.out.println("getSpellChecker()");
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public TextEditor() {

	}

}
