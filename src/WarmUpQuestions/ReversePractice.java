package WarmUpQuestions;

public class ReversePractice {

	public static void main(String[] args) {
		//	2. question , arr[]={123, 343,567,987, 54, 44} , bu arraydaki palinromic  olan sayilari tek tek console yazdiralim, palindrome sayi 
			//, reverse yazilisi kendine esit ol asayi ,ornegin 343, 44 gibi .Yapan arkadaslarda bu chatten paylasabilir.   
			//Bu arada arraydaki sayilarin digitleri farkli olacagi icin, int numDigits = String.valueOf(number).length(); methodunu kullanip , verilen bir sayinin kac digit oldugunu bulup, loop u buna gore dondurebilirsiniz. (edited) 	}
	int arr[]={123, 343,567,987, 54, 44, 2332};
			
			reverse(123);
			for(int i=0; i<arr.length; i++) {
				
				if(reverse(arr[i])) {
					System.out.println(arr[i]);
				}
			}
			
			
			
		}
		
		
		
		public static  boolean reverse(int num) {
			int number =num;
			int numDigits = String.valueOf(number).length();
			int reverse=0;
			for(int i=0; i<numDigits; i++) {
				int remainder=num%10;
				    reverse=reverse*10+remainder;
				    num=num/10;
				
				
			}
			
			if(reverse==number) {
					return true;
			}else {
				return false;
			}

}
}