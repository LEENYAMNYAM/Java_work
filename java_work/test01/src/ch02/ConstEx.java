package ch02;

public class ConstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI=3.14;   // final을 사용하면 최초에 입력되는 값을 변경 불가능함.
		final int MAX_NUM=100;
		
//		PI= 3.141592;  이렇게 입력하면 에러남.
		
		System.out.println(PI);
		System.out.println(MAX_NUM);
		
	}

}
