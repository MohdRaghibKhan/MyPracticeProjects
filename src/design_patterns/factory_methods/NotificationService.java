package design_patterns.factory_methods;

interface Notification {
	void send(String notification);
}

class EmailNotificationService implements Notification {
	@Override
	public void send(String notification) {
		System.out.println(notification);
	}

}

class SMSNotificationService implements Notification {

	@Override
	public void send(String notification) {
		System.out.println(notification);
	}
}

class PUSHNotificationService implements Notification {
	public void send(String notification) {
		System.out.println(notification);
	}
}

class NotificationFactory {

	public static Notification notificationFactory(String type) {

		if (type.equals("EMAIL")) {
			return new EmailNotificationService();
		} else if (type.equals("SMS")) {
			return new SMSNotificationService();
		} else if (type.equals("PUSH")) {
			return new PUSHNotificationService();
		}
		throw new IllegalArgumentException("Unknown notification type: " + type);
	}
}

public class NotificationService {

	public static void main(String[] args) {

		Notification emailFactory = NotificationFactory.notificationFactory("EMAIL");
		emailFactory.send("This is Email notification....this is you task");

		Notification smsFactory = NotificationFactory.notificationFactory("SMS");
		smsFactory.send("This is SMS notification....our OTP is 1234");
		
		Notification pushFactory = NotificationFactory.notificationFactory("PUSH");
		pushFactory.send("This is popup notification....Your favorite channel just uploaded a new video.");

	}

}
