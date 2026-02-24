package special_classes;

public class ReverseString01 {
public static void main(String[] args) {
	
	String name = "MOHIT";
	System.out.println(name);
	String temp = "";
	for(int i=0;i<name.length();i++) 
	{
		temp=name.charAt(i)+temp;
		//  convert string into char M-O-H-I-T then plus temp
		// temp = M+"" - O+M - H+OM -I+HOM -T+IHOM
		// temp = TIHOM thne exit the loop to see this you can print the temp inside the loop
	System.out.print(temp+"-->");
	}
	System.out.println();
	System.out.println("--------------------------");
	System.out.println(temp);
	
	
}
}
