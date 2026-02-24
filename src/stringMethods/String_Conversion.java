package stringMethods;

public class String_Conversion {
public static void main(String[] args) {
	/*
	 *  toString
	 *  toBinaryString
	 *  toHexaString
	 *  toOctalString
	 *  parseInt
	 * */
	int num = 100;
	String str = "100";
	System.out.println(num +" to String		: "+(Integer.toString(num)));
	System.out.println(num +" to Binary String	: "+(Integer.toBinaryString(num)));
	System.out.println(num +" to Hexa String	: "+(Integer.toHexString(num)));
	System.out.println(num +" to Octal String	: "+(Integer.toOctalString(num)));
	System.out.println(str +" to parseInt		: "+(Integer.parseInt(str)));
	
}
}
