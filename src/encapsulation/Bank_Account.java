package encapsulation;

public class Bank_Account {

	private int accNo;
	private String name;
	private double balance;
	private final int pin;
	
	//Constructor
	public Bank_Account(int acc, String name) 
	{
		this.pin = 1234;
		this.accNo=acc;
		this.name=name;
		
		this.balance=0.0;
	}

	//Deposit Amount 
		public void deposit(int accNo,double amt) 
	{
		if(this.accNo==accNo) {
			if(amt>0) {
			this.balance=this.balance+amt;
			System.out.println("Deposit "+amt+" INR successfully. Current balance	: "+this.balance);
			}else {System.out.println("Invalid deposit amount.");}
	
			}else {
				System.out.println("Invalid Account Number.");
			}
	}
		
	//Withdraw Amount(Pin Required)	
	void withdraw(int num,int pin, double amt) 
	{
		if(this.pin==pin) {
			if(amt<=this.balance) {
				this.balance=this.balance-amt;
				System.out.println("Withdraw "+amt+" inr Successfully. Remaning Balance	:  "+this.balance);
			}else {System.out.println("insufficient Funds!");}
		}else {System.out.println("Invalid Account details or Pin");}
	}
	void details() {
		System.out.println();
		System.out.println("Account Number : "+this.accNo+" || Account Holder : "+this.name+" || Balance : "+this.balance);
		
	}
}
