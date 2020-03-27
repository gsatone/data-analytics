package gjs.com.tools;

import gjs.com.api.LanguageChecker;
import gjs.com.services.SpellChecker;

public class TextEditor {

	private LanguageChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
	}

	public LanguageChecker getSpellChecker() {
		return spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
