package practiseclass;

public class Runner001 {

	public static void main(String[] args) {
	//Create an object whose data type is Animal
		//Constructor is also Animal()
		
		//Note : If parent class and child class have methods
		//       whose names are the same, look at the data types
		//       to understand which one will be called
		//       If you are trying to access a variable you need to check the data type
		//       If you are trying to access a method you need to check the constructor
		
		// Note : If you use "parent class" as data type the variables and methods which are
		//        in child class, will not be accessible
		// Note: If you use "child class" as data type the variables and methods which are
		//       in parent class will be accessible
		Animal001 obj1 = new Animal001();
		System.out.println(obj1.age);//17
		obj1.eat();//Animals eat
		System.out.println(obj1.add());//8

		Animal001 obj2 = new Cat001();
		System.out.println(obj2.age);//17(came from Animal)
		System.out.println(obj2.name);//Joe(came from Animal)
		obj2.sound();////Cats meow(came from Cat)
		System.out.println(obj2.multiply());//63(came from Cat)
		
		Cat001 obj3 = new Cat001();
		System.out.println(obj3.age);//4
		System.out.println(obj3.height);//2
		obj3.eat();//Cats drink milk
		System.out.println(obj3.add());
	}

}
