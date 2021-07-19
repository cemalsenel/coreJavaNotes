package practiseclass;

import java.util.Scanner;

public class PractiseClassDiscountt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter price");
		double d = scan.nextDouble();
		System.out.println("Please enter unit");
		int i = scan.nextInt();
		
		if((d*i)>1000) {
			System.out.println((d*i)*0.1);
		}else {
			if((d*i) < 0) {
				System.out.println("Try again");
			}
			if((d*i)<1000 && (d*i)>=0) {
				System.out.println("No Discount");
			}
		}

	}

}
