package gjs.com.services;

import gjs.com.api.LanguageChecker;

public class SpellChecker implements LanguageChecker{
	
	public SpellChecker(){
		System.out.println("Inside SpellChecker constructor." );
	}
	public void checkSpelling(){
		System.out.println("Inside checkSpelling." );
	}
}
