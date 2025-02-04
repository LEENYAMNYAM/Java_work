package ex_LEEJUNMOK06;

public class Ex06_1_Customer extends Ex06_1_Person {
//	필드
	private int personNo;
	private int mileage;
	
// 	생성자
	public Ex06_1_Customer() {
		
	}
	public Ex06_1_Customer(int personNo, int mileage) {
		
		this.personNo = personNo;
		this.mileage = mileage;
	}
	public Ex06_1_Customer(String name, String address, String tel, int personNo, int mileage) {
		super(name, address, tel);
		this.personNo = personNo;
		this.mileage = mileage;
	}
	
//	setter&getter
	public int getPersonNo() {
		return personNo;
	}
	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
//	메소드
	public void print(int personNo, String name, String address, String tel, int mileage) {
		System.out.printf("고객 번호 : %S \n", personNo);
		super.print(name, address, tel);
		System.out.printf("고객 번호 : %S \n", mileage);
	}
}
