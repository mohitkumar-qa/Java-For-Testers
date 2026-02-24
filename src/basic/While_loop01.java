 package basic;

public class While_loop01 {

	public static void main(String[] args) {
		
		int a = 0;
		while (a<5) 
		{
			a+=1; //it will print till a is less then 11 
			System.out.println("2 * "+a+" = "+ a*2);
			
		}
		System.out.println();
		System.out.println(" Do While Loops");
		System.out.println();
		int b = 5;
		do 
		{
			b+=1;
			System.out.println("2 * "+b+" = "+ b*2);
			
		}while(b<5); 
		// in do while loop, loop will run atleast one time whether condition true or false
		// As you can see b+=6 is greater then while condition but still it run atleast one
		// it happens because first loop while run then while condition is checked
	}
	
	
}
