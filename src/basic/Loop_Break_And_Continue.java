package basic;

public class Loop_Break_And_Continue {

	public static void main(String[] args) {
		
		int a = 0;
		while(a<5) 	// here  a<5 is true as a = 0 so it will print the result 

		{
			a+=6 ;		//but Now the value of a = 6 now a<5 is false so it will exit the loop

			if(a==4)	//a==4 never triggerd as value of a is never come as a=4 

				break;
			System.out.println("2 * "+a+" = "+ a*2);
			
			
			// In continue if condition value will be skip but code will run until while condition is true
			// In break code will be exit once if condition is fulfilled
			 
		}
	}
}
