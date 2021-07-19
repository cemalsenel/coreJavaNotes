package practiseclass;

public class Encapsulation002 {

	/*
	  1) We use encapsulation to hide data and method implementations
	  2)Encapsulated codes should have following characteristics
	    a) Everyone should know how to access to encapsulated data
	    b) It should be easy to use even the code is complicated
	    
	  3) How to make encapsulation:
	     a)Make the access modifier "private"
	     b)Create "getter" and "setter"
	       getters are used to read the data
	       setters are used to update the data
	       
	   4) The advantages of encapsulation:
	     a)It gives us flexibility, whenever we want we can just update data with the help of setters
	     b) Reusebility : we create getters and setters just once and use them again and again
	  5) After creating private variables if you do not create any setter methods , it will be updated in the class.
	     Because of that the class is called "immutable class"
	  
	  If you want to no one to read your data , do not create getter methods
	  If you want to no one to update your data , do not create setter methods
	  
	 */
	public static void main(String[] args) {
		Encapsulation001 obj = new Encapsulation001();
		System.out.println(obj.getAge());
		System.out.println(obj.getCollegeName().equals("Oxford"));
		System.out.println(obj.getSsn());
		obj.setAge(67);
		System.out.println(obj.getAge());
	}
}
