package inheritance;

public class PolyMain {

	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
		tr.set(20, 10);
		tr.area();
		System.out.println("-----------------------");
		Rectangle r = new Rectangle();
		r.set(51, 20);
		r.area();
				
		
	}
}
