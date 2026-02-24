package oops;

public class Method_Overloading {

	//same name but different Data Type (in Parameter)
	
	public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.meth(10, 20);
		mo.meth(5, 10);
		mo.meth(10, 20, 30);
	}
	
	public void meth(int a , int y) 
	{
		System.out.println(a+y);
	}
	public void meth(int a , double y) 
	{
		System.out.println(a+y);
	}
	public void meth(int a , int y, int z) 
	{
		System.out.println(a+y+z);
	}
}
