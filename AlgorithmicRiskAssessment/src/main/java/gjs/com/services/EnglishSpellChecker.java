package gjs.com.services;

import gjs.com.api.LanguageChecker;

public class EnglishSpellChecker implements LanguageChecker{
	
	public EnglishSpellChecker(){
		System.out.println("Inside SpellChecker constructor." );
	}
	public void checkSpelling(){
		System.out.println("Inside checkSpelling." );
	}
}
