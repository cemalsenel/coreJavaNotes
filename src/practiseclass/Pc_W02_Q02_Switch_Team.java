package practiseclass;

import java.util.Scanner;

public class Pc_W02_Q02_Switch_Team {
	// Question 1: Type the codes which asks the user to put the
	// letters for the favorite football club in Turkey. It prints "Galatasaray" for
	// gs, it prints "Trabzonspor" for ts, it prints "Besiktas"
	// for bjk and it prints "Fenerbahce" for fb. Please use switch statement in
	// your codes.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favourite football team");
		String team = scan.nextLine().toLowerCase();
		
		switch (team) {
		case "fb":
		System.out.println("Fenerbahçe");
		break;
		case "gs":
			System.out.println("Galatasaray");
			break;
		case "bjk":
			System.out.println("Beþiktaþ");
			break;
		case "ts":
			System.out.println("Trabzonspor");
			break;
			default:
				System.out.println("Enter valid abbreviation");
		
		}
		

	}

}
