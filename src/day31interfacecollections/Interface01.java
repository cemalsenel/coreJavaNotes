package day31interfacecollections;

public interface Interface01 {
	/*
	   1) If it is not must, do not use same names for variables in parent interfaces
	   2) If you need to use same names for variables in parent interfaces, when you call variables 
	      do not forget to use "interface names" otherwise you will get Compile Time Error
	 */

	int v1 = 2000;
	String name1 = "Audi";
}
 interface Interface02 {

	int v1 = 3000;
	String name2 = "Honda";
}
 class Car implements Interface01,Interface02{
	 
	 public static void main(String[] args) {
		System.out.println(name1);//Audi
		System.out.println(name2);//Honda
		System.out.println(Interface01.v1);//2000
		System.out.println(Interface02.v1);//3000
	}
 }

