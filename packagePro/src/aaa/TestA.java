package aaa;


class TestB{
	private int a;
	
	void func1() {
		a=10;
	}
	public void func2() {
		System.out.println("func2");
	}
}


public class TestA {
	void func1() {
		TestB b = new TestB();
//		b.a=10;      // 변수 a의 접근지정자가 private이기 때문에 다른 클래스에서 접근이 불가능함.
		b.func1();	 // 클래스 TestB에 있는 func1() 함수는 접근지정자가 default이기 때문에 접근이 가능함.
	}
	public void func2() {
		System.out.println("func2");
	}
	
}
