package stringMethods;

public class SubString {
	public static void main(String[] args) {
	
	// use to Extracts a part of a string
		String name = "MohitKumar";
		System.out.println(name.substring(0, 5));
	//Start with 0 but ends with -1 
	//Mohit --> 0,4 but we write 0,5
		
		System.out.println(name.substring(5));
	//here you write only starting index number
	// it will skip the left side part of the string from the index value
	}	

}
