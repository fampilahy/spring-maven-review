package conf.on.code;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	
	@Autowired
	private SpellChecker spellChecker;

	
	
	public TextEditor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	
	

}
