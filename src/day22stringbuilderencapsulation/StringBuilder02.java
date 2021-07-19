package day22stringbuilderencapsulation;

public class StringBuilder02 {

	public static void main(String[] args) {
		/*
	 	In StringBuilder we use "append()", in String we use "concat()" or "+"
	*/
		StringBuilder sb1 = new StringBuilder();
		
		long startingTimeSb = System.nanoTime();
		for(int i=0; i<1000; i++) {
			sb1.append("abc");
		}
		long endingTimeSb = System.nanoTime();
		System.out.println(endingTimeSb - startingTimeSb);
		
		
		String str1 = new String();
		for(int i=0; i<1000; i++) {
			str1.concat("abc");
		}
		long endingTimeStr = System.nanoTime();
		System.out.println(endingTimeStr - endingTimeSb);


	}

}
