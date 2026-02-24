package stringMethods;

public class Contains {
	public static void main(String[] args) {
		
	//use to check if the string has the given text inside it
		String name = "Mohit";
		System.out.println("hi :"+name.contains("hi"));
		//True
		System.out.println("HI :"+name.contains("HI"));
		//False
	// it is case sensitive so be careful 	
	}
}
