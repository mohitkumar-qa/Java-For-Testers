package oops;

public class Methods_Types {

public static void main(String[] args) {
	Methods_Types mt = new Methods_Types();
	mt.meth01();
	mt.meth02("Method 02");
	System.out.println(mt.meth03(3));
}
	//01 Non-Paremetrize 
	public void meth01() 
	{
		System.out.println("Method 01 ");
	}
	//02 Parametrize
	public void meth02(String met ) 
	{
		met = "Method 02";
		System.out.println(met);
	}
	//03 Retun type 
	public int meth03(int m) 
	{	 m=3;
			return m; 
	}
}