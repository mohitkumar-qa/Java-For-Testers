package stringMethods;

public class Split {
	
	// if we have long string and we want to split it by using space comma and all 
	public static void main(String[] args) {
		
		String add = "Delhi India Asia ";
		
		String[] parts = add.trim().split("\\s+");
		// " "  uses for split on single space
		// \\s+ uses for one or more spaces
		// ","  uses for split by comma
		
		for( String s : parts) 
		{
			System.out.println(s);
		}
		
	}

}
