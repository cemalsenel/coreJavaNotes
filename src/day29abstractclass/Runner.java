package day29abstractclass;

public class Runner {

	public static void main(String[] args) {
		
		ElementarySchoolCalculator elStudent = new ElementarySchoolCalculator();
		System.out.println(elStudent.add(2,3,4));
		System.out.println(elStudent.division(4, 2));
		
		
		HighSchoolCalculator hsStudent = new HighSchoolCalculator();
		System.out.println(hsStudent.add(5,4,7));
		System.out.println(hsStudent.division(12, 4));
	}

}
