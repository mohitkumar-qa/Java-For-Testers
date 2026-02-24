package stringLearning;

public class StringComparison {
	/*
	 * Equals
	 * Compare To
	 * Equal Ignore Case
	 */
	public static void main(String[] args) {
	
		String str1 = "Mohit";
		String str2 = "Mohit";
		String str3 = "MOHIT";
		
		System.out.println("str1 == str3 : "+(str1 == str3)); // False because both has defferent cases(upper & lower)
		System.out.println("str1 == str2 : "+(str1 == str2)); // True  because both has same cases (upper & lower) 
		
		System.out.println();
		System.out.println(" **** Confusion ****");
System.out.print("str1 == str2 : ");		
		System.out.println("str1 == str2 : "+str1 == str2);
		// its false because + Operator has higher precendence then == 
		// so java first use + operator and concantinate first part then compare it with str2 so result will be false
		
		System.out.println();
		System.out.println("		Equals		");
		System.out.println("Finding that str1 equals to str2	: "+str1.equals(str2));
		System.out.println("Finding that str1 equals to str3	: "+str1.equals(str3)); 
		// its false because str1 and str3 both have different case (UpperCase and LowerCase) 
		// to make it true use equalsIgnoreCase
		System.out.println();
		System.out.println("		Equal Ignore Case		");
		
		System.out.println("Finding that str1 equals to str3 using equalsIgnoreCase	: "+str1.equalsIgnoreCase(str3));
		
		System.out.println();
		System.out.println("		CompareTo		");
		System.out.println("Comparing str1 to str2	: "+str1.compareTo(str2));
		System.out.println("Comparing str1 to str3	: "+str1.compareTo(str3));
		
		/*
		 * 0  means both strngs are equal
		 * <0 means String1 comes before String2
		 * >0 means String1 comes After String2
		 */ 
		
}
}
