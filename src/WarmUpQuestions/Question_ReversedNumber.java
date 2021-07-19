package WarmUpQuestions;

public class Question_ReversedNumber {

	public static void main(String[] args) {
		/*
		  find the reverse of a given number , input =456 , output =654
		 */
		int num = 654;
		
		int reversed = 0;
		
		for (int i = 0; i < 3; i++) {
			
			int remainder = num % 10;
			reversed = reversed * 10 + remainder;//6-5-4 , reversed = 6
			
			num = num / 10;
			
		}
		System.out.println(reversed);

	}

}
