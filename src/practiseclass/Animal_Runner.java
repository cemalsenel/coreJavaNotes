package practiseclass;

public class Animal_Runner {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		Animal obj2 = new Animal_Dog();
		
		obj2.sound();
		System.out.println(obj2.age);
		System.out.println(obj2.add(4, 5));
	}

}
