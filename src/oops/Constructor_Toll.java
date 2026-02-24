package oops;
/**
 * Concept of Constructor
 * A block of code similar to method that gets executed when instance of a class is created
 * Generally used to initialize member variable of a class
 * Contructor name is same as that of class name
 * Constructor doesn't have return type (It does not return any value)
 * Constructor Overloading 
 * */
public class Constructor_Toll {
	String type;
	int tires;
	
	// Construtor
	public Constructor_Toll(String type, int tires) 
	{
		this.type=type;
		this.tires=tires;
	}
	//Constructor Overloading
	 public Constructor_Toll(int tires,String type) 
	 {
		 this.type=type;
		 this.tires=tires;
	 }
	public void toll_Amount() 
	{
		 if(tires==2) {
			System.out.println("Vehicle	: "+type+"\nTyres	: "+tires+"\nToll Amount is 0");
		 }	else if(tires==4) {
			System.out.println("Vehicle	: "+type+"\nTyres	: "+tires+"\nToll Amount is 10");
		 }	else if(tires>4)	 {
			 System.out.println("Vehicle	: "+type+"\nTyres	: "+tires+"\nToll Amount is 20");
		 }  else {
			 System.out.println("Vehicle	: "+type+"\nTyres	: "+tires+"\nIncorrect Tyre Count");
		 }
	 }
	
	
	
	public static void main(String[] args) {
		Constructor_Toll toll = new Constructor_Toll("Truck",8);
		//Constructor Overloading
		Constructor_Toll toll2 = new Constructor_Toll(12,"Truck Rail");
		toll.toll_Amount();
		System.out.println("	**********");
		toll2.toll_Amount();
		
	}
}
