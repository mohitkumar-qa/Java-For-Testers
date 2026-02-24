package basic;

public class GradeSystem {
public static void main(String[] args) {
		
		int num = 40;
				
		
		// There are total 5 conditions
		// Execution stops when the first true conditions is found.
		if(num>=90){
			System.out.println("Grade A ");
		}else if(num>=75){
			System.out.println("Grade B ");
		}else if(num>=60){
			System.out.println("Grade C");
		}else if(num>=40){
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
}
