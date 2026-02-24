package stringMethods;

public class CharAt {

	public static void main(String[] args) {
		
		String name = "Mohit";
		System.out.println(name.charAt(0)); //M
		System.out.println(name.charAt(4));
		
		System.out.println(name.charAt(name.length()-1));
	// use this when you don't know how many characters are inside the string
	// here you use length function then -1 because index value starts from 0	
	
	}
	
	
}
