package stringMethods;

public class ToCharArray {

	// Convert String into array of Characters
	
	public static void main(String[] args) {
		
		String str = "Testing";
		char[] chars = str.toCharArray();
		
		for(char c : chars) 
		{
			System.out.print(c+"-");
		}
		// it will convert String to character and seperate them using -
	}
	
	
}
