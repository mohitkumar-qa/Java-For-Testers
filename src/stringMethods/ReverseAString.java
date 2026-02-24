package stringMethods;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "MOHIT";
		System.out.println(name);
		System.out.println("---------------");
		//01
		for(int i =name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("---------------");
		//02
		String temp ="";
		for(int j=0;j<name.length();j++) {
			temp=name.charAt(j)+temp;
		}
		System.out.println(temp);
		
		
		
	}
	
}
