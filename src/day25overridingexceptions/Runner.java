package day25overridingexceptions;

public class Runner {

	public static void main(String[] args) {
		//Create an object whose data type is Animal, constructor is Dog
		//Note : When you create an object, you may use "parent classes" as data type
		//Data type + variable name = new Data type();
		//there are two ways to create new object  ===> 1) Dog obj2 = new Dog(); 2) Animal obj1 = new Dog();
		//Note : If "parent" and "child" classes have methods whose names are same
		//       look at the data types to understand which one will be called
		//Note : If you use "parent class" as data type , the class members in child class will be
		//       unaccessible
		 Animal obj1 = new Dog();//name , height - drink()
		 
		//Note : If you use "child class" as data type , the class members in child class 
	    //      second and in parent class will be accessible
		    Dog obj2 = new Dog();//birthYear , tail , name , height - drink() ,bark()

	}

}
