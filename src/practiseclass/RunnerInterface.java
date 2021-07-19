package practiseclass;

public class RunnerInterface {

	public static void main(String[] args) {
		
		DogInt dog = new DogInt();
		dog.eat();
		dog.givingBirth();
		dog.move();
		dog.sound();
		System.out.println(AnimalInterface.NUM);
		System.out.println(MammalsInterface.NUM);
		
		
		/*
		 All variables are static interfaces, because of that we use "interface" name to acces them.
		 If you use object name to access variables Java will be confused.
		 We can access variables by using interface name
		 */
		
		
		// System.out.println(dog.AGE);//9          ==> not recommended
		System.out.println(AnimalInterface.AGE);//9 ==> recommended
		
		/*
		 For unique variables if you use object to access variable , it works
		  but it is not recommended. Instead , access them with interface name.
		 */

	}

}
