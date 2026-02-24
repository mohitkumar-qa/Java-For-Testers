package stringMethods;

public class Practice {

	public static void main(String[] args) {
		
		//Revese a string 
		
		String name = "Mohit";
		System.out.println(name);
		//01
		char[] c = name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) 
		{
			System.out.print(c[i]);
		}
		System.out.println();
		//02
		String temp = "";
		for(int i=0;i<name.length();i++) 
		{
			temp = name.charAt(i)+temp;
		}
		System.out.println(temp);
	}
	
	
}
