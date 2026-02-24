package regex_for_Tester;

public class MustContains {
public static void main(String[] args) {
	 // used when you want to force something to be present.
	
	String name = "Mohit";
	String name2 = "Mohit9";
	System.out.println(name +"	: "+name.matches("(?=.*[0-9]).+"));
	System.out.println(name2 +"	: "+name2.matches("(?=.*[0-9]).+"));
	
	//(?=.*[0-9])	--> must contain at least one number
	// .+ 			--> any character allowed after that
	
}

}
