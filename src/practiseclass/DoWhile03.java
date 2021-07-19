package practiseclass;

public class DoWhile03 {

	public static void main(String[] args) {
		digitCounter();
		/*
		 * or the String "1234_?!abcdef", type a code to count the number of letters,
		 * the number of digits and the number of others by using do-while loop
		 */

	}

	public static void digitCounter() {
		String str = "1234_?!abcdef";

		String digitCounter = "";
		String charsCounter = "";
		String othersCounter = "";
		int i = 0;
		do {
			char c = str.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				charsCounter += c;
				i++;
			} else if (c >= '0' && c <= '9') {
				digitCounter += c;
				i++;
			} else {
				othersCounter += c;
				i++;
			}
		} while (i < str.length());
		System.out.println("Digits number : " + digitCounter.length());
		System.out.println("Characters number :" + charsCounter.length());
		System.out.println("Others number : " + othersCounter.length());
	}

}
