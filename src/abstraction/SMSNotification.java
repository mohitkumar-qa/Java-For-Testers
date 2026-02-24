package abstraction;

public class SMSNotification extends Notification {

	
	@Override
	boolean validRecipient(String recipient) {
	
		return recipient.length()==10 && recipient.matches("\\d{10}");
	}

	@Override
	void sendNotification(String recipient, String message) {
		if(validRecipient(recipient)) {
			System.out.println("SMS sent to "+recipient+" : "+message);
		}
		else {
			System.out.println("Invalid Phone Number!");
		}
		
	}

}
