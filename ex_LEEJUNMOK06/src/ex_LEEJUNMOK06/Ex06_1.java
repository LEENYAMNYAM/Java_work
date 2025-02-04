package ex_LEEJUNMOK06;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex06_1_Customer c1 = new Ex06_1_Customer();
		c1.setPersonNo(1);
		c1.setName("홍길동");
		c1.setAddress("부산시 연제구 중앙대로");
		c1.setTel("010-1234-5678");
		c1.setMileage(50);
		
		c1.print(c1.getPersonNo(), c1.getName(), c1.getAddress(), c1.getTel(), c1.getMileage());
		
	}

}
