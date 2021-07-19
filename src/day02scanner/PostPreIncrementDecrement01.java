package day02scanner;

public class PostPreIncrementDecrement01 {

	public static void main(String[] args) {
		//Post increment means increase at the end of the statement
		
		int x = 12;
		//Post increment means increase at the end of the statement
		System.out.println(x++);//12
		System.out.println(x);//13
		
		//Pre increment means increase before the name of the variable
		System.out.println(++x);//14

		//Post deccrement means decrease at the end of the statement
		System.out.println(x--);//14
		System.out.println(x);
		
		//Pre decrement means decrease before the name of the variable
		System.out.println(--x);//12
	}

}
