package lambdaEx;

interface Unit7{
//	void move(String s);
	
	// 1,2번-------------------------------------------------------------------//
	
//	int getLength(String s);

	//3번-------------------------------------------------------------------//
	
	int sum(int a, int b);
	
	//4번-------------------------------------------------------------------//
	
//	void move();
	
	//5번-------------------------------------------------------------------//
}

public class LambdaEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//람다식의 원래 형식
//		Unit7 unit = (String s) -> {
//			System.out.println("Lambda Unit7");
//		};
		
		// 1번-------------------------------------------------------------------//
		
		// 매개변수가 1개일때는 소괄호와 형을 생략해서 아래처럼 쓸수도 있음.
//		Unit7 unit = s -> {
//			System.out.println("Lambda Unit7");
//		};
		
		//구현문장이 1개뿐이라면 중괄호도 생략가능 (가장많이 쓰게되는 형태)
//		Unit7 unit = s -> System.out.println("Lambda Unit7");
		
		// 2번-------------------------------------------------------------------//
		
		//단, return이 포함될 경우는 중괄호 생략이 불가능
//		Unit7 unit = s -> {
//			return s.length();
//		};
//		
//		int len = unit.getLength("abcd");
//		System.out.println(len);
	
		// 3번 -------------------------------------------------------------------//
		
		//파라미터가 두개 이상일때는 형은 생략가능하나 소괄호는 생략 불가능
//		Unit7 unit = (a, b) -> {
//			return a+b;
//		};
//		
//		System.out.println(unit.sum(10,20));
		
		// 3-1번 -------------------------------------------------------------------//
		
		//구현부가 반환문 하나라면 return과 중괄호 모두 생략가능
//		Unit7 unit = (a, b) -> a+b;
//		System.out.println(unit.sum(10,20));
		
		// 4번 -------------------------------------------------------------------//
		
//		Unit7 unit = () -> System.out.println("aaa");
		
		// 5번 -------------------------------------------------------------------//
	}

}
