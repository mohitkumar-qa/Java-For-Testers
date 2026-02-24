package basic;

public class Nested_Exercise {

	public static void main(String[] args) {
		
		
		 //* 
		 //* *
		 //* * *
		 //* * * *
		 //* * * * * 
		// print this pattern
		 
		// here we can see the number of stars printed as per line first line one star second line 2 and so on 
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");

			}
			System.out.println(" ");	
		}
		
	}
	
	
}
