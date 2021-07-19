package warm_up_01;

public class WarmUpSwitch {

	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("Perfect");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
		case 'D':
			System.out.println("Not Bad");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Not valid grade");
		}

	}

}
