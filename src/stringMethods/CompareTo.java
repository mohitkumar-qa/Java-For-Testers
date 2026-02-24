package stringMethods;

public class CompareTo  {

	// Compare tio /compareToIgnoreCase()
	//Compare String in dictonary order (used in sorting).
	public static void main(String[] args) {
		
		System.out.println("Apple compare to Banana	: "+"Apple".compareTo("Banana")); // Negative A<B
		System.out.println("Car compare to Cat	:"+"Car".compareTo("Cat")); //R<T
		// Compare Character 1 of both Strings
		// if Equals--> go to next character
		// if not Equal --> return difference --> stop
	}
}
