package stringMethods;

public class IsEmpty {

	// checks if string is empty or blank
	public static void main(String[] args) {
		
		String empty = "";
		String space = "  ";
		
		System.out.println("empty isEmpty : "+empty.isEmpty()); //True
		System.out.println("space isBlank : "+space.isBlank()); //True
		System.out.println("space isEmpty : "+space.isEmpty()); //False
		System.out.println("empty isBlank : "+empty.isBlank()); //True
		
		// an empty string can be Empty and Blank both
		// an space(blank) can't be empty as it is containing space
	}
	
	
}
