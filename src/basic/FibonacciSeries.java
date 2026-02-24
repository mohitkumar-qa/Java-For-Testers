package basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 0 1 1 2 3 5 8 13 
		
		System.out.print("Number of Terms : ");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;		
		
		System.out.print(num1+" "+num2+" ");
		
		
		for(int i=0;i<n-2;i++) // whether use n-2 or start with i=2 as we already added num1 and num2 which is not part of this loop
		{
			int temp = num1+num2; // 0+1 ,1+1 ,1+2 ,2+3 ,3+5 ,5+8  (0 to 5 loops)  
			System.out.print(temp+" ");
			num1 = num2; // num1 = 1 ,1 ,2 ,3 ,5 
			num2 = temp; // num2 = 1 ,2 ,3 ,5 ,8 
		}
		
	}
	
	
} 
