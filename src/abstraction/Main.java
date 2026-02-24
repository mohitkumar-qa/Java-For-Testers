package abstraction;

public class Main {
public static void main(String[] args) {
	
	Mobile m; // only method called which use in the mobile class not in the other classes 
	m=new Ios();
	m.doubleTap();
	System.out.println("********************");
	
	m=new Android();
	m.doubleTap();
	
}
	
}
