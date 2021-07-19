package practiseclass;

public abstract class Shape {
	/*
	 Abstract Method:
	 Sometimes we need a method which has no body. These methods are called "abstract methods"
	 To create an abstract method you need to follow these three steps:
	   1)Remove the body
	   2)Put "abstract" keyword between access modifier and return type
	   3)Make the CLASS abstract. 
	   You can create abstract methods in only abstract classes
	   
	 Abstract Class:
	 >We need abstract classes to create abstract methods
	 >NOTE: We cannot create an object from abstract classes!!!
	 ( An abstract class cannot be instantiated with "new" keyword.)
	 >They can have constructors.
	 >We can create concrete methods(not abstract) in abstract classes
	 
	 */
	
	public abstract int area(int a, int b);
	public Shape() {//Abstract classes may have constructors
		super();
		
	}
	public abstract int perimeter(int a, int b);
	public abstract void colour();
	public void draw () {
		System.out.println("I can draw");
	}

	/*
	 An abstract method can not be final static, private. Because we create abstract methods to override
	 but we can not override final, static and private methods
	 */
}
