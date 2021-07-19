package javaofficehours;

public class Runner_Pool {

	public static void main(String[] args) {
		
		Rectangle_Pool  rectangle = new Rectangle_Pool(5,10);
		System.out.println("Rectangle width : " + rectangle.getWidth());
		System.out.println("Rectangle length : " + rectangle.getLength());
		System.out.println("Rectangle area : "+ rectangle.getArea());
		
		Rectangle_Pool_Cuboid cuboid = new Rectangle_Pool_Cuboid(5,10,5);
		System.out.println("Cuboid width : " + cuboid.getWidth());
		System.out.println("Cuboid length : " + cuboid.getLength());
		System.out.println("Cuboid height :"+ cuboid.getHeight());
		System.out.println("Cuboid volume : "+ cuboid.getVolume());

	}

}
