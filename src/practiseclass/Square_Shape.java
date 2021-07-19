package practiseclass;
/*
If parent class is abstract, when you create an abstract child class you don't need to
override abstract methods in your parent abstract class.
*/

public abstract class Square_Shape extends Shape {

	@Override
	public int area(int a, int b) {
		b = a;
		return a*a;
	}

	@Override
	public int perimeter(int a, int b) {
		b = a;
		
		return 4 *a;
	}

	

	
	

}
