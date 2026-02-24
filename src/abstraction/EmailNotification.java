package abstraction;

public class EmailNotification extends Notification {

	@Override
	boolean validRecipient(String recipient) {
		
		
		return recipient.contains("@")&&recipient.contains(".");
	}

	@Override
	void sendNotification(String recipient, String message) {
		if(validRecipient(recipient)) {
			System.out.println("Email sent to "+recipient+" : "+message);
		}else 
		{
			System.out.println("Invalid Email Address !");
		}
		
	}

	


}
