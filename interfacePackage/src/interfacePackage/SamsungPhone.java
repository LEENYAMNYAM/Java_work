package interfacePackage;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("전화를 보냅니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 받습니다.");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}
