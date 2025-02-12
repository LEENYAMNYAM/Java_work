package testPro;

public class Phone {
	
//	필드
	private String name;
	private String tel;
	private String address;

//	생성자
	public Phone() {
	}

	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

//	getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
//	메소드
	public void print() {
		System.out.printf("%s의 번호와 주소는 %S, %S 입니다.", name, tel, address);
	}
	
	
}
