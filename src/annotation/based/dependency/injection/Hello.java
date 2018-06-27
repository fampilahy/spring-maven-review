package annotation.based.dependency.injection;

import org.springframework.beans.factory.annotation.Required;

public class Hello {

	private TextEditor textEditor;

	public Hello() {

	}

	public TextEditor getTextEditor() {
		return textEditor;
	}

	@Required
	public void setTextEditor(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

}
