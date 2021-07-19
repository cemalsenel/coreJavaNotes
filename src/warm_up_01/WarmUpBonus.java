package warm_up_01;

import java.util.Scanner;

public class WarmUpBonus {

	public static void main(String[] args) {
		/*
        A company decided to give bonus of 5% to employee if his/her year of 
        service is more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.
   EXAMPLE:
    INPUT      :  4 year service
                Salary :  4000 
    OUTPUT :  0
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your salary");
		int salary = sc.nextInt();
		System.out.println("Please enter your year");
		int year = sc.nextInt();
		 
		if(year>=5) {
			System.out.println("Your bonus is : " + (salary*0.05) + "$");
		}else {
			System.out.println("You have to work " + (6 - year) + " more years, You slave!!!");
		}sc.close();
	}

}
