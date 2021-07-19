package practiseclass;

public class AccessModifiers001 {

	private String privateString = "Private String";
	protected String protectedString = "Protected String";
	String defaultString = "Default String";
	public String publicString ="Public String";
	
	public void publicMethod() {
		System.out.println("This is public method");
	}
	protected void protectedMethod() {
		System.out.println("This is protected method");
	}
	void defaultMethod() {
		System.out.println("This is default method");
	}
	private void privateMethod() {
		System.out.println("This is private method");
	}
}
