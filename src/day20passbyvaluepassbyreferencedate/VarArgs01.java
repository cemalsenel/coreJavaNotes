package day20passbyvaluepassbyreferencedate;

public class VarArgs01 {
	/*
	 1) If you a want a method to run with different number of arguments, use varargs
	 2) Varargs behaves like lists but behind the varargs arrays work
	 3)To declare a varargs use "int... a" or "String... s" etc....
	 4)varagsmust be the last parameter inside the method parenthesis
	 5)Can I use multiple varargs inside a method parenthesis ==>cannot use multiple varargs in a method parenthesis
	 */

	public static void main(String[] args) {
		System.out.println(add(-3,-5));
		System.out.println(retirementPayment("Mary Stone" , 2,3,5,6));
		System.out.println(salaryPay("Jayjay",24,8,30,12));
	}
	public static int add(int... a) {
		int sum = 0;
		for(int w : a) {
			sum = sum+w;
		}
		return sum;
	}
	public static String retirementPayment(String empName,int... amount) {
		
		int result = 1 ;
		
		for(int w : amount) {
			result = result*w;
		}
		return empName +" : "+result;
	}
	public static String salaryPay(String str,int... slr) {
		int salary= 1;
		for(int w : slr) {
			salary = salary*w;
		}
		return str+" : "+salary;
	}

}
