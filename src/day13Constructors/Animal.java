package day13Constructors;

public class Animal {
	/*
	 1) Constructors must have same name with the Class
	 2) Constructor names start with uppercases(Because they match with class names) but method names start with lowercases
	 3) Methods must have "return type" , but Constructors must not
	 */
	
	public  String name = "Joe";
	public int weight = 78;
	public static boolean isHerbivorous = false;
	

	public static void main(String[] args) {
	
		Animal dog = new Animal();
		System.out.println(dog.name);//Joe
		System.out.println(dog.weight);//78
		System.out.println(dog.isHerbivorous);
		
		dog.move();
		dog.eat();
		dog.drink();
		

	}
	public static void eat() {
		if(isHerbivorous) {
			System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
		
	}
	public static void drink() {
		System.out.println("Drinks Water");
	}
	public static void move() {
		System.out.println("Moves");
	}

}
