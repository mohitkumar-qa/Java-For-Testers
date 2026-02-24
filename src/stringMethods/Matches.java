package stringMethods;

public class Matches {
public static void main(String[] args) {
	
	String chr = "h";
	String num = "4";
	String str = "Mohit";
	System.out.println("chr : "+chr);
	System.out.println("num : "+num);
	System.out.println("str : "+str);
	System.out.println("chr matches h : "+chr.matches("[a-z]"));
// useful for single character 
	System.out.println("num matches 4 : "+num.matches("[1-5]"));
	// useful for single number
	System.out.println(str.matches("[a-zA-Z]+"));
	// + useful for one and more occurences
	System.out.println();
	System.out.println( "**** Extra ****");
	String mail = "Mohit@gmail.com";
	System.out.println(mail+" : "+(mail.matches("[A-Za-z0-9@.]+")));
	// the above method says
	// [A-Za-z0-9@.]+ 
	// . means matche any single character 
	// + means match one or more times
	
	System.out.println("TO check specific E-mail Pattern :");
	System.out.println(mail+" : "+mail.matches("[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z.]+"));
		
	// it will follow format like 
	// [A-Za-z0-9]+ --> Character/Number any = mohit9 or mohi or 034
	// @ -->followed by @
	// [A-Za-z] --> only alphabets allowed no digits
	// //. --> .
	// [A-Za-z] --> only alpahabets allowed
	
	}
}
