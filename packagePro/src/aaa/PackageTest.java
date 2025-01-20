package aaa;

import bbb.TestC;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestA a = new TestA();
		a.func1();
		a.func2();
		TestB b = new TestB();
		b.func1();
		b.func2();
		TestC c = new TestC();      // 패키지가 다르기 때문에 import 하면 public class에는 접근가능
//		TestD d = new TestD();		// 패키지가 다른데, TestD는 default(같은 패키지에서만 사용가능)를 접근지정자로 가지기 때문에 사용할 수 없음.
		
	}

}
