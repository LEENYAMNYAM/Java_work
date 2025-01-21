package pk0121_2;

import pk0121.Student;

public class StudentWork extends Student {
	public void set() {
//		age=30;     // age는 접근지정자가 default라서 package가 달라지면 접근 불가
		name = "abcd";
		height = 178;     	// 접근지정자가 public인 name과 protected인 height 는 접근가능
		
		setWeight(99);		// getter,setter를 이용해서 age, weight값에 간접 접근가능
		setAge(30);
		System.out.println(getWeight());
		System.out.println(getAge());
	}

}
