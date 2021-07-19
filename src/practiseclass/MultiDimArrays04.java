package practiseclass;

public class MultiDimArrays04 {

	public static void main(String[] args) {
		// Print Bee on the console
		String arr[][] = { { "A", "B", "V" }, { "e", "L", "f" }, { "h", "e", "r", "t" } };
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j].equals("B")) {
					str = str + arr[i][j];
					break;
				} else if (arr[i][j].equals("e")) {
					str = str + arr[i][j];
					break;
				}
			}
		}
		System.out.println(str);
	}
}
