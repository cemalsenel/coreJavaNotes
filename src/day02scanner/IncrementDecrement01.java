package day02scanner;

public class IncrementDecrement01 {
    // Increment : If you increase the value of a variable, then  this process is called as "Increment"
	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("Before decrement : " + num1); //5
		//Increase the value of num1 by 3.
		
		//1.way:
		num1= num1 + 3 ;
		System.out.println("After decrement : " + num1);//8
		
		//2.way:
		num1 += 3; //no seperation between +=
		System.out.println("After decrement : " + num1);
		
		
		//3.way: This way can be used just to increase by 1
		num1++; // ==> means num1+=1; or num1 = num1 + 1;
		System.out.println("After decrement : " + num1);//12
		//Note:increment can be done by multiplication as well
		
		num1 = num1*2;
		System.out.println("After decrement : " + num1);//24
		
		num1*=2;
		System.out.println("After decrement : " + num1);//48
		
		//Decrease the num1 by 2
		//1.way:
		num1 = num1 - 2;
		System.out.println("After decrement : " + num1);//46
		
		//2.way:
		num1 -= 2; // 44....no space between -=. but there is space can be possible other parts
		System.out.println("After decrement : " + num1);
		
		//3.way
		num1--;
		System.out.println("After decrement : " + num1);//43
		
		num1--;
		num1--;
		System.out.println("After decrement : " + num1);//41 ...means minus by -1-1
		
		//Note:Decrement can be done by divison as well
		
		num1 = num1 / 2;
		System.out.println("After decrement : " + num1);
		
		num1 /=2;
		System.out.println("After decrement : " + num1);//10
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
