package encapsulation;
/**
 * Encapsulation : Wrapping data(Variables) and code(methods) together into a single unit(Class)
 * It protects data by making variables private and providing controlled access thorugh public getter and setter methods.
 */

public class Classroom {
	
	private String sub ;
	private int student;
	
	//Getter 
	public String getSub() {
		return sub;
	}
	public int getStudent() {
		return student;
	}

	//Setter
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	
	public void displayDetails(){
		System.out.println("Subject	: "+sub+"\nStudent	: "+student);
	}
}
