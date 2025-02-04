package ex_LEEJUNMOK06;

public class Ex06_1_Person {
//	필드
	private String name;
	private String address;
	private String tel;
	
//	생성자
	public Ex06_1_Person() {}

	public Ex06_1_Person( String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
//	setter&getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
//	메소드
	public void print(String name, String address, String tel) {
		System.out.printf("이    름 : %S \n주    소 : %S \n전화 번호 : %S \n",name, address, tel );
	}
}
