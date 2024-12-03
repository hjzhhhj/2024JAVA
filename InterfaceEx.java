package InT;


interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
public class InterfaceEx {
	public static void main(String args[]) {
		// SmartPhone phone = new SmartPhone();
	}
}
