package abstraction;

public class NotificationMain {

	
	public static void main(String[] args) {
		Notification n;
		
		n= new EmailNotification();
		n.sendNotification("Mohit956@gmail.com", "Hello My dear Friend");
		
		n=new SMSNotification();
		n.sendNotification("0123454678", "djfjdkf");
		
	}
	
}
