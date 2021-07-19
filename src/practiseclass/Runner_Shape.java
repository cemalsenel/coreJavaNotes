package practiseclass;

public class Runner_Shape {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle_Shape();
		System.out.println(rectangle.area(4, 5));
		rectangle.colour();
		
		Circle_Shape circle = new Circle_Shape();
		System.out.println(circle.area(5, 5));
		circle.colour();
		
		SquareRoom_Square squareroom = new SquareRoom_Square();
		squareroom.draw();
		
		

	}

}
