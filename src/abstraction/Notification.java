package abstraction;

public abstract class Notification {

	
	//abstract methods
	abstract boolean validRecipient(String recipient);
	abstract void sendNotification(String recipient, String message);
	
	//concrete(normal)
	public void notificationInfo() {
		
		System.out.println("Sending Notification.....");
	}
	
	
	
	
	
	
	
	
	
	
	
}
