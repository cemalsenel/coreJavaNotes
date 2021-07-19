package day24inheritanceoverriding;

public class Honda extends Car {
	public void factory() {
		System.out.println("Factory is in Japan");
	}
	
	/*
	    Note : Using "@Override" annotation is not a must to achieve "overriding", but
	           it has 2 benefits:
	           1) When you use "@Override" annotation, Java checks overriding for you.
	              If it is not correct, it gives you Compile Time Error
	           2) When you use "@Override" annotation, it is good for readability
	           
	     Note : "private" methods cannot be overridden
	     
	     Note : Access modifiers of "Overriding methods" (Methods are in Child Class)
	            should be wider than or equal to the access modifiers of "Overridden methods"(Methods are in Parent Class)
	            
	     Note : If return type is "primitive" or "void" in overriding ,you cannot touch to the return type
	     Note : If return type is "non-primitive",  you should have "IS-A" relationship.
	 */
	//Overriding Method
	@Override
	public void move() {
		System.out.println("Honda reaches 100 in 6 seconds");
	}

	@Override
	public void engine() {
		System.out.println("Honda has eco-engine in every model");
	}

	@Override
	public int spend() {
		return 22;
	}

	@Override
	public String speak() {
		return "Honda can speak in Japan";
		//String and Object have "IS-A" relationship(String IS-A Object)
		//Opposite of this is not possible
		//String is child of Object
	}

	
}
