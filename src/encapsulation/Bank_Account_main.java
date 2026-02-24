package encapsulation;

public class Bank_Account_main {

	public static void main(String[] args) {
		Bank_Account bnk = new Bank_Account(64120,"Mohit");
		//Account number and Name is set in Cosntrutor which can't be change for this object 
		//to change it we need to create another object
		
		bnk.deposit(64120, 10000);
		bnk.withdraw(64120, 1234, 5000);
		bnk.details();
	System.out.println("	************");
		Bank_Account bnk2 = new Bank_Account(15120,"Mohan");
		bnk2.details();
		bnk2.deposit(15120, 54000);
		
		
		
		
	}
}
