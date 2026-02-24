package inheritance;

public class Main {
public static void main(String[] args) {

	Class1 c1 = new Class1();
	c1.num1=20; 
	c1.num2=25;
	c1.add();
	System.out.println("-------------------------");
	Class2 c2 = new Class2();
	c2.subtract(); //Instance varaible belong to the object, not to the class.
	c2.num1=40;
	c2.num2=50;
	c2.subtract();
	c2.add();
}
}
