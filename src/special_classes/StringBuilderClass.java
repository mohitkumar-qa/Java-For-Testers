package special_classes;

public class StringBuilderClass {


public static void main(String[] args) {
	/*
	 * StringBuilder class is used to create mutable(Modified) string
	 * Some useful methods:
	 * append, insert, replace, delete, reverse
	 * 
	 * */
	
	String 	str1 = "I";
			str1 = str1+" Like";
			str1 = str1+" Java";
		//No of Stirng created here are 
			// I --> Like --> I Like --> java --> I LIKE JAVA
	StringBuilder sb  = new StringBuilder("I");
	sb.append(" Like");
	sb.append(" Java");
	
	System.out.println(str1);
	System.out.println(sb);

	

	
	
	
}
}
