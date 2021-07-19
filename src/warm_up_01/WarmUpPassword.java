package warm_up_01;

import java.util.Scanner;

public class WarmUpPassword {

	/*
    Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
    */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your password");
       String password = sc.nextLine();
       if (password.equals("JavaLearner")) {
    	   System.out.println("Correct");
       }else {
    	   System.out.println("Wrong Password");
       }sc.close();
	}

}
