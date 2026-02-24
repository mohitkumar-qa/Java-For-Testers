package regex_for_Tester;

public class Allowed_Characters {
public static void main(String[] args) {
	//This only means characters are allowed , not required
	String name = "Mohit";
	String name2 = "Mohit@";
	System.out.println(name+" : "+name.matches("[A-Za-z0-9.]+"));
	System.out.println(name2+" : "+name2.matches("[A-Za-z0-9.]+"));
	
	System.out.println(name2+" : "+name2.matches("[A-Za-z0-9].+"));
	// its true when we put '.' outside the brackets which allows anything after matching the condition inside the brackets
	 
	
}
}
