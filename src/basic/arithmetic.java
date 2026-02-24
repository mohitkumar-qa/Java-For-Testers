package basic;


public class arithmetic {

	// This program demostrate how arithmetic expression are evaluated in java.
	// Java follows the operator precendece similar to the BODMAS rule.
	// However, for operators with the same precedence(like* and /),
	// Java evaluates them from LEFT to RIGHT.
public static void main(String[] args) {
	System.out.println("=== Arithmetic Precedence Demonstration ===");
	
	// Addition and Subtraction (left to right)
	double result = 10-5+2;
	System.out.println("	10-5+2\n	10-5	= 5+2\n	5+2	= 7\n	Result	: "+result);
	System.err.println();
	// Multiplication and divison (left to right)
	double result1 = 5*10/2;
	System.out.println("	5*10	= 50/2\n	50/2	= 25\n	Result	= "+result1);
	
	

}}
