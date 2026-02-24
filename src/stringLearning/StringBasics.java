package stringLearning;

public class StringBasics {
	
	/**
	 * Concatenate
	 * Length
	 * Trim
	 * UpperCase
	 * LowerCase
	 * Empty
	*/

	public static void main(String[] args) {
		
		String str1 = "  Mohit";
		String str2 = " Kumar  ";

		System.out.println("		Concatenation		");
		System.out.println("str1 + str2		: "+str1+str2);
		System.out.println("Str1.concate(str2)	: "+str1.concat(str2));
		System.out.println();
		System.out.println("		Trim & length		");
		String str3 = str1+str2;
		System.out.println("Name Before Removing Extra Spaces	: "+str3);
		System.out.println("str3.length() (Before Trim)		: "+str3.length());

		System.out.println("Name After Removing Extra Spaces	: "+str3.trim());
		System.out.println("str3.trim().length (After Trim)		: "+str3.trim().length());
		System.out.println("There are total 10 letter in the name but its showing 11 because it is calculating space between str1 and str2");
		System.out.println();
		System.out.println("		UpperCase & lowercase		");
		System.out.println("Using Upper Case : "+str3.toUpperCase());
		System.out.println("Using lower case : "+str3.toLowerCase());
	System.out.println();
	System.out.println("		To check String is Empty or Not		 ");
	System.out.println("Checking str3 is Empty or not : "+str3.isEmpty());
	
	}
}
