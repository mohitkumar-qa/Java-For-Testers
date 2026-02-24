package basic;

public class Problem_Bitwise {

	// swipe to number without using third variable 
	public static void main(String[] args) {
		
	
		
			int num1 = 10;
			int num2 = 8;
			
			num1 = num1^num2; //--> 1010 ^ 1000 = 0010 = 2
			num2 = num1^num2; //--> 0010 ^ 1000 = 1010 = 10
			num1 = num1^num2; //--> 0010 ^ 1010 = 1000 = 8
	 		System.out.println(" num1 : "+ num1 + "\n num2 : "+num2);  
	
	
}
}