package practiseclass;

public class Rectangle_Shape extends Shape{
	
	 /*
    If you want to create a CONCRETE-sub-class of an abstract class you have to override all
    abstract methods. These overridden methods are concrete now you may implement their body.
   
    Overriding concrete methods is optional
    */

	@Override
	public int area(int height, int length) {
		
		return height * length;
	}

	@Override
	public int perimeter(int height, int length) {
		
		return 2 * (height+length);
	}

	@Override
	public void colour() {
		System.out.println("I want a blue rectangle");
	}

	@Override
	public void draw() {
		
		super.draw();
	}

}
