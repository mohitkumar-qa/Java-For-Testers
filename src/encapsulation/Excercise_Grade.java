package encapsulation;

public class Excercise_Grade {

	private int num;
	
		public Excercise_Grade(int num) {
			this.num= num;
		// Created construtor as all grade depends on num variable 
		
			//so need to create object of setNum method
		}	
	
	//Setter : set Marks
		// NO need to create grade variable as all depends on num
	public void setNum(int num) {
		if(num>=0 && num<=100) {
			this.num=num;
		}else{
			System.out.println("Invalid Number, Enter Between 0 to 100.");
		};
	}
	
	public String grade() {
		if(num>=90) {return "A";
		}else if(num>=75) {
			return "B";
		}else if(num>=34) {
			return "C";	
		} else {
			return "Fail";
		}
		
	}
	public void detials() 
	{
		System.out.println("Number	: "+num);
		System.out.println("Grade	: "+grade());
	}
	
	
}
