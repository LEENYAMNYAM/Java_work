package ex_LEEJUNMOK06;

public class Ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체1 입력
		Ex06_2_Magazine m1 = new Ex06_2_Magazine();
		m1.setTitle("잡지A");
		m1.setPages(10);
		m1.setWriter("기자A");
		m1.setDate("2010년 2월 25일");

//		객체2 입력
		Ex06_2_Magazine m2 = new Ex06_2_Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
			
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
	}

}
