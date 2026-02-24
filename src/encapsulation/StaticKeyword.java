package encapsulation;

public class StaticKeyword {
	
	static String name ;
	int num ;
	
	
	void details() 
	{
		System.out.println("Name	: "+name);
		System.out.println("Number	: "+num);
	}

	public static void main(String[] args) {
		StaticKeyword sk = new StaticKeyword();
		name ="Mohit";
		sk.num = 50;
		sk.details();
		StaticKeyword sk2 = new StaticKeyword();
		sk2.num=52;
		sk2.name= "Ram";
		sk.details();
		// as you can see in output that name is changed from mohit to ram but number still same 
		// when we make any variable as static it can replace old data with new one 
		// by using static keyword we don't need to create objective. we can call it directly 
		name=",ohit";
	}
}
