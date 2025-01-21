package pk0121;

import pk0121.Person;

public class Student extends Person{
	public void set() {
		age = 30;	// 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동";
		height = 175; 
//		 weight = 99;		// 오류. 슈퍼 클래스의 private 멤버라서 접근불가
		setWeight(99);		// private 멤버는 get/set을 이용하여 간접 접근해야함.
		System.out.println(getWeight());
	}

}
