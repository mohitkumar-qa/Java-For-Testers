package oops;

public class Access_Modifiers {

/*
 * Public Access: Same Class, Same Package and Project
 * Default Access / No Access Specifier : Same Class and Same Package only
 * Private Access : Same Class Only
 * Protected Access : Same Class and Same Package "can be in the Project if inherited
 */
	public static void main(String[] args) {
		
	}
	public void doThisPublic() 
	{
		System.out.println("Public Modifier : ");
		System.out.println("Can be Access anywhere ");
	}
	
	private void doThisPrivate() 
	{
		System.out.println("Private Modifier : ");
		System.out.println("Access within the same class only");
	}
	 void doThisDefault() 
	{
		System.out.println("Default Modifier : ");
		System.out.println("Access within the Same Package");
	}
	 
}
