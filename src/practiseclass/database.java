package practiseclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class database {
	/* Create a class : RandomNameGenerator 
	* Step1: Ask user to enter his/her name //john walker 
	* Step2: Delete the spaces in the username//johnwalker 
	* Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146") 
	* Step4: If there the username is not taken, then print: This username is available 
	* Step5: If the username is already taken, then print This username is already taken 
	* Step6: Then generate a random number, add to the name, and Print the new username 
	*/ 

	public static void main(String[] args) {
		
		List<String> database = new ArrayList<>();
		
		database.add("sam");
		database.add("johnmary");
		database.add("johnwalker");
		database.add("johnwalker523463146");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name = scan.nextLine().toLowerCase();
		String username = name.replace(" ", "");
		
		Random randomNum = new Random();
		int random = randomNum.nextInt(100000001);
		
		boolean notAvailable = database.contains(username);
		
		if(!notAvailable) {
			System.out.println("This username is available ! \nAdded to the DataBase !");
			database.add(username);
			System.out.println(database);
		}else {
			System.out.println("This username is already taken ! "
					+ "You can use this: " + username + random +"\nDo you want to use it ? (y/n)");
			String userChoice = scan.next().toLowerCase();
			
			if(userChoice.equals("y")) {
				database.add(username + random);
				System.out.println("Username Created Successfully !\nAdded to the DataBase !");
				System.out.println(database);
			}else {
				System.out.println("OK");
			}
		}
		
		scan.close();

}
}