package stringLearning;

public class BasicMacthing {

	public static void main(String[] args) {
		
		String str1 = "Test";
	
		System.out.println(str1.matches("Test"));
		System.out.println(str1.matches("(?i)test"));
		//(?i) means "case-insensitive mode"
		// it will match "test","Test","TEST","TeSt" etc
	
		
		
		
		
	}
	
	
}
