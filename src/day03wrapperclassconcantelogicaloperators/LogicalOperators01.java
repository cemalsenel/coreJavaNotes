package day03wrapperclassconcantelogicaloperators;

public class LogicalOperators01 {
	/*
	 Operators in Java
	 1) = : is Assignment Operator : gets the value from right and puts it into conatiner . For example : int x = 12;
	    Note : Followings are "Comparison Operators". Comparison Operators always return "boolean".
	    
	 2) ==  : Equal sign : For example ; 5==2+3 : Returns "boolean" . If left part equals to right part, it turns true. Otherwise it returns false.
	          "(System.out.ptintln(5==2+3);" /true: turns to true or false.
	          
	 3)! : means "not equal" "System.outçprintln(5 !=2+4);" /true.means not equal.
	      If left part does not equal to right part , it returns true ,otherwise it turns false.
	       Note : ! ==> "not" and returns "boolean"
	       
	 4) > : means " greater than ".... returns "boolean" . "System.out.println(5>2);" ..returns true
	 
	 5) < : means "less than" and returns "boolean" .      "System.out.println(5<6);"..returns true
	 
	 6) >= : means "greater than" or " equal to"...returns "boolean"
	 
	 7) <= : means "less than" or " equals to". returns " boolean"
	   Note : Followings are "Logical Operators" and Logical Operators always return to "boolean"
	 
	 8) && ...And Operator 
	    && : returns true if everything is true.All parts must be true.
	    
	 9) || ...Or Operator
	    || : returns false if everything is false
	    
	 10) & : And Operator
	     & : returns true if everything is true.All parts must be true. 
	       
	 */
	public static void main(String[] args) {
		System.out.println(5 == 3 + 2);
		System.out.println(5 != 2);
		System.out.println(5 > 13);
		System.out.println(5 >= 5);
		System.out.println(5 <= 2);
		System.out.println((5>2) && (4==4) && (9<10));
		System.out.println((5>2) && (4==4) && (11<10));
		System.out.println((5>2) || (4==4) || (9<10));
		System.out.println((5>6) || (5==4) || (11<10));
		System.out.println((5>6) || (4==4) || (11<9));
		
		//What is the difference between & and && ?
		// "&&" is doing less task because it does not check other options if there is a false in the begining. "&" does more task because it will check all options even if there is a  false already.
		
		
		
		
		
		
		
		
		
		
	}

}
