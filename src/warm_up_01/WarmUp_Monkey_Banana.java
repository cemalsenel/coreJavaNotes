package warm_up_01;

public class WarmUp_Monkey_Banana {

	public static void main(String[] args) {
		/* There is a lonely monkey in the island
	     * He needs to eat 4 bananas every day
	     * There are just 165 bananas in that island
	     * 
	     * Create following variables and find how many day monkey can survive.
	     * Use do while loop, increment and decrement and if statements
	     * 
	       int numbersOfBananas = 165;
	       
	       int survivalDays = 0;
	       
	       boolean monkeyAlive = true;
	     */
  
   int numbersOfBananas = 165;
	       
	       int survivalDays = 0;
	       
	       boolean monkeyAlive = true;
	       
	   
	    	   
	    	   do {
	    		   numbersOfBananas= numbersOfBananas-4;
	    		   survivalDays++;
	    		   if(numbersOfBananas<4) {
	    			   monkeyAlive=false;
	    		   }
	    	   
	       }while(monkeyAlive); 
	      
	      
		System.out.println(survivalDays);
}

}
