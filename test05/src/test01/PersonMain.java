package test01;

public class PersonMain {

	static void display(Person p, String str) {
		if(str.equals("p")) {
			p.show();
			System.out.println();
		}
		else if(str.equals("s")) {
			Student s = (Student) p;
			p.show();
		}else if(str.equals("e")) {
			Employee e =(Employee) p;			
		// 다운 스케일링을 하는 이유는 Person에는 없는 레퍼런스(변수, 함수 등)을 사용하기 위해(지금은 오버라이딩된 함수만 썼음)
			p.show();
		}
//		p.show();
	}
//	static void display(Student p, String str) {
//		p.show();
//	}
//	static void display(Employee p) {
//		p.show();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Student s1 = new Student(1, "홍길동", 20, "남자", "컴공");
//		s1.showStudent();
//		Student s2 = new Student(2, "김철수", 24, "남자", "정보통신");
//		s2.showStudent();
//		
//		Employee e1 = new Employee(1, "홍길동", 24, "남자", "개발", "대리", 400);
//		e1.showEmployee();
//		Employee e2 = new Employee(2, "김철수", 30, "남자", "개발", "대리", 500);
//		e2.showEmployee();
//		
//		
////		<업캐스팅>
//		Person p1  = new Student(1, "홍길동", 20, "남자", "컴공");   //업캐스팅 가능
////		p1.showStudent();			// 대신 자식에만 있는 레퍼런스(메소드)를 사용수 없음.
//		p1.showPerson();				// 때문에 Person에만 있는 레퍼런스(showPerson 메소드)만 사용가능.
//		
//		Person p2  = new Person("홍", 20, "남자");
////		Student s1 = (Student)p2 ;						// 다운캐스팅은 안됨.
//		
////		Student s2 = new Person("홍길동", 20, "남자");		// 
//		Person p3 = new Student(1, "홍길동", 20, "남자", "컴공");
//		p3.showPerson();
//		Student s3 = (Student)p3;
//		s3.showStudent();
		
		
//		<업캐스팅/다운캐스팅>
		Person p1 = new Person("홍", 20, "남자");
		display(p1, "p");
		Student s1 = new Student(1, "홍길동", 25, "남자", "컴공");
		display(s1, "s");
		Employee e1 = new Employee(2, "김철수", 30, "남자", "개발", "대리", 400);
		display(e1, "e");
		
//		Person[] persons = new Person[3];
//		persons[0] = new Person("홍", 20, "남자");
//		persons[1] = new Student(1, "홍길동", 25, "남자", "컴공");
//		persons[2] = new Employee(2, "김철수", 30, "남자", "개발", "대리", 400);
//		
//		for(Person p : persons) {
//			p.show();
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
