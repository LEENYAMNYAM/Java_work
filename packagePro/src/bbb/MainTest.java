package bbb;

import aaa.TestA;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestA a = new TestA();		// 다른 패키지에 존재하지만, 접근지정자가 public이기때문에 import를 사용하면 접근가능함.
//		a.func1();					// 클래스 TestA에 접근가능하지만, func1는 default를 접근지정자로 가지기 떄문에 접근불가능.
		a.func2();					// 클래스 TestA에 접근가능하고, func2는 public을 접근지정자로 가지기 떄문에 접근가능.
//		TestB b = new TestB();		// TestB는 다른패키지에 있고 default를 접근지정자로 가지기 때문
		TestC c = new TestC();
		TestD d = new TestD();
			
	}

}
