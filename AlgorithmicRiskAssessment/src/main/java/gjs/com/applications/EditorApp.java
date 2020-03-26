package gjs.com.applications;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjs.com.tools.TextEditor;

public class EditorApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor ted = (TextEditor) context.getBean("textEditor");
		ted.spellCheck();
	}
}
