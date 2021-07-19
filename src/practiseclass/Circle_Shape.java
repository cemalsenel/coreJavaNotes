package practiseclass;

public class Circle_Shape extends Shape {
	  /*
    We created a concrete sub class of an abstract class, we override all the abstract methods
    but we didn't override the concrete method. Overriding concrete methods is optional
    */
	@Override
	public int area(int radius, int pi) {
		pi = (int) Math.PI;
		return pi*radius;
	}

	@Override
	public int perimeter(int pi, int radius) {
		pi =(int)Math.PI;
		return pi * 2 * radius;
	}

	@Override
	public void colour() {
		System.out.println("I want a pinl circle");
		
	}

}
