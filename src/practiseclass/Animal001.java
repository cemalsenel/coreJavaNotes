package practiseclass;

public class Animal001 {
	int age = 17;
	String name = "Joe";
	
	public void sound() {
		System.out.println("Animals make sound");
	}
	public void eat() {
		System.out.println("Animals eat");
	}
	public int add() {
		return 3+5;
	}

	public Integer multiply() {
		return 2*8;
	}
	public Animal001 create() {
		return new Animal001();
	}
}
