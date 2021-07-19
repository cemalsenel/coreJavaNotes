package warm_up_01;

import java.util.Scanner;

public class DrawingTriangle {

	public static void main(String[] args) {
		drawTriangle();

	}

public static void drawTriangle() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s = scan.nextInt();
		
		
		
		for(int i=s; i>0; i--) {
		
			for(int j=0; j<s-i; j++) {
				
				System.out.print(" ");
			}
			
			
			for(int k=s;  k>s-i; k--) {
				System.out.print("* ");
			}System.out.println();
		}
		
		scan.close();

}
}
