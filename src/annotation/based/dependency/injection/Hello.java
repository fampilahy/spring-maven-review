package annotation.based.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Hello {
	
	private TextEditor textEditor;

	public Hello() {

	}

	public TextEditor getTextEditor() {
		return textEditor;
	}

	@Autowired
	@Qualifier("textEditor2")
	public void setTextEditor(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

}
