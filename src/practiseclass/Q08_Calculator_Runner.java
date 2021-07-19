package practiseclass;

public class Q08_Calculator_Runner {

	public static void main(String[] args) {
		
		Q08_Calculator_Advance obj = new Q08_Calculator_Advance();
		obj.add(4,5,6,8,9,2,6);
		obj.substract(5,9);
		obj.multiplication(6,5,2);
		obj.division(9,0);
		obj.division(6, 2);
		obj.absolute(-9);
		obj.squareRoot(16);
		obj.squareRoot(-16);
		
		Q08_Calculator obj2 = new Q08_Calculator();
		obj2.add(6,5);
		obj2.substract(5, 8);
		obj2.multiplication(4,8);
		obj2.division(6, 2);
	}

}
