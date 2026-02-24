package regex_for_Tester;

public class Digit_NoDigit {
public static void main(String[] args) {
	
	System.out.println("123	: "+"123".matches("\\d+"));
	System.out.println("123	: "+"123".matches("\\D"));
	
	// --> \\d for Digit 
	// --> \\D for No Digit
}	
}
