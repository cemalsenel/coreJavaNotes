package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
		
		String arr [][] = {{"A","B"},{"K" , "e"},{"L", "e"}};
		//By using given multidimensional array, print "Bee" on the console
		String str = "";
		for(int i = 0 ; i<arr.length ;i++) {
		str = str + arr[i][arr[i].length-1];
		}
		System.out.println(str);
		
		//Homework
		//Find the multiplication the first elements in every array
		int brr [][] = {{32,12,11},{21,34},{3}};
		
		int prod = 1;
		for(int i = 0 ; i<brr.length ; i++) {
		   prod = prod * brr[i][0];
		}
		System.out.println(prod);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
