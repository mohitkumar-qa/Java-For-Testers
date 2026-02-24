package stringMethods;

public class EqualIgonreCase {

	public static void main(String[] args) {
		
	// use to compares two strings exactly	
		String str = "Mohit";
		String str1 = "mohit";
		
		// as we know Java is case Sensitive Language
		// str==str1 is false to make it true use EqualIgnoreCase
		
		System.out.println("Equal Ignore Case : "+str.equalsIgnoreCase(str1));
	}
}
