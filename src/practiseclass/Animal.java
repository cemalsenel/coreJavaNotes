package practiseclass;

public class Animal {
	int age = 15;
	String name = "Joe";
	
	public void sound() {
		System.out.println("Animal makes sound");
	}
	
	public int add(int a, int b) {
		return 3+5;
	}
	public Integer multiply(int a , int b) {
		return 2*9;
	}
	public Animal create () {
		return new Animal();
	}

}
