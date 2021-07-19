package warm_up_01;

import java.util.Scanner;

public class WarmUp05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter mid-term grade");
		double midtermGrade = sc.nextDouble();
		System.out.println("Please enter project grade");
        double projectGrade = sc.nextDouble();
        System.out.println("Please enter final exam grade");
        double finalGrade = sc.nextDouble();
        
        double grade = midtermGrade * 0.3 + projectGrade * 0.2 + finalGrade * 0.5;
        System.out.println("Your Grade is : " + grade);
        
        //System.out.println("Your Grade is : " + ((midtermGrade*0.3) + (projectGrade*0.2) + (finalGrade*0.5)));
	}

}
