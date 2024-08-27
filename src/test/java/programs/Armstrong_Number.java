package programs;

public class Armstrong_Number {

	public static void main(String[] args) {

		// An Armstrong number is one whose sum of digits raised to the power three equals the number itself.
		// 371, for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371. PROGRAM ArmstrongNumber.
		// 0, 1, 153, 370, 371, 407 are examples 
		
		
		int number = 153;
		
		int n  = number ;
		 
		int rev = 1;
		 
		int reminder  = 0;
		
		while(n>0) {
			
			reminder = n%10;
			
			rev = rev * reminder;
			
			n= n/10;
			
		}
		
		System.out.println("After multiplied "+ rev);
	
	
	
	if(number == rev) {
		
		System.out.print("\n " + " The given number is armsrtong "+ rev);
	}
	else
		System.out.println("The given number is not an armstrong "+ number);
}

}