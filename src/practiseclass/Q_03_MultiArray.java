package practiseclass;

public class Q_03_MultiArray {

	public static void main(String[] args) {
		/*
		 Type a program that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 30
		 */

		 int arr1[][] = {{1,3,6},{2,8},{5,7,9,14}};
		 int sum = 0 ; 
		 for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j]%2==0) {
					sum = sum + arr1[i][j];
				}
			}
			
		}System.out.println(sum);
		
		
		
		
		
		
		
	}

}
