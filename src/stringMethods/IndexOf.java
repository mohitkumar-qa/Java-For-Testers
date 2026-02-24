package stringMethods;

public class IndexOf {
	public static void main(String[] args) {
		
	//to Finds position of a character or word in a string	
		String name = "Mohit is testing";
		System.out.println(name);
		
		System.out.println("Index value of i		: "+name.indexOf("i"));
		// it will show the first letter index value
		System.out.println("Index value of i		: "+name.indexOf("i",4));
		// it will starts from 4th index value
		System.out.println("Index value of i 'Last value'	: " +name.lastIndexOf("i"));
		// it will search from last index 
		
	//Try some exercise 
		//where String is "Coding is Must to learn Automation Testing "	
	   // here find out the index value of t from Automation
	  // Remember that t is nether first nor last t 
	}
}
