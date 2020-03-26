package gjs.com.dao;

public class SingletonBean implements Messesging {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}
}
