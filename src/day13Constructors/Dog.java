package day13Constructors;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	
	//I created a constructor below.
	//The constructor has no any parameter.
	//The constructor has nothing inside the body
	//That kind of constructors are same with the default constructors
	//If you create a constructor Java deletes the default one
	public Dog() {
		
	}
	
	public Dog(String name) {
		
	}
	
	public Dog(int weight ,int height) {
		
	}
	
	public Dog(String name, int weight ,int height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Joe");
		System.out.println(dog1.name);
		dog1.sound();
		System.out.println("====================");
		
		Dog dog2 = new Dog("Bobby" , 24 , 67);
		
		
		System.out.println(dog2.name );
		System.out.println(dog2.weight);
		System.out.println(dog2.height);
        dog2.sound();
        
        //If you want to access class members , you should create object from the class
        
        
	}
	
	
	public static void sound() {
		System.out.println("Dogs bark...");
		
	}
	

}
