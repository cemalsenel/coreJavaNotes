package javaofficehours;

public class Office_2_AvarageValueOfAnArray {

	/*
     * Write a java program that calculates the average value of array elements
     *
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */
	public static void main(String[] args) {
		int[] input= {1,2,3,4,5,6,7};
		
		int sum=0;
		for(int i=0; i<input.length;i++) {
			sum=sum+input[i];//sum+=input[i];
		}
		//Calculate the average
		double average=sum/input.length;
		//Print the solution
		System.out.println("Avarege of elements in the given array "+average);
	}
}
