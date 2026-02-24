package stringMethods;

public class Replace {
	//Replace a character or word with another

	public static void main(String[] args) {
		String str = "Automation Testing with Java";
		System.out.println(str);
		System.out.println("Java --> Python : "+str.replace("Java", "Python"));
		//it will replace all the words Java --> Python 
		// Remember java is CaseSensitive Language it will not replace 'java' as it start with lowercas
		
	}
	
}
