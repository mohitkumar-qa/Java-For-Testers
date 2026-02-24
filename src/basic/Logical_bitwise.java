package basic;

public class Logical_bitwise {

	public static void main(String[] args) {
		
		/*
		 * Logical Operator
		 *  And = && both need to true to be true else its false
		 *  Or  = || any of them is to true then result is true
		 *  Not = !  
		 */
		
		boolean a = true;
		boolean b = false;
		System.out.println("Result of &&	: "+(a&&b));
		System.out.println("Result of ||	: "+(a||b));
		
		/*
		 * Bitwise Operator its work using binary values
		 * And = &
		 * Or  = |
		 * XOR = ^
		 */
		int num1 =  45; // 101101
		int num2 = 60;  // 111100
		System.out.println("Result of &	: "+(num1&num2)); //101100 = 44
		System.out.println("Result of |	: "+(num1|num2)); //111101 = 61
		
		//XOR 
		int a1 = 10; //1010
		int b2 = 5; // 0101
		
		System.out.println(a1^b2); // 1111 =   15
		    
	
	}
	
	
	
	
	
	
	
	
	
}
