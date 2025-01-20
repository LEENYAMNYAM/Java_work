package packagepro;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.count);				// 객체를 아직 만들지 않았는데 출력가능
		
		Student s1 = new Student();
		System.out.println("count = " + s1.getCount());
		System.out.println(Student.count);              // private 변수가 아니게 되면 이렇게 쓸 수 있음.
		
		Student s2 = new Student(1,"홍", "컴공");
		System.out.println("count = " + s2.getCount());
		
		Student s3 = new Student();
		System.out.println("count = " + s3.getCount());
		
		
		s1.setSno(2);
		s1.setName("kim");
		s1.setMajor("정보통신");
		
		System.out.println(s1.getSno());
		System.out.println(s1.getName());
		System.out.println(s1.getMajor());
		
		System.out.println(s2.getSno());
		System.out.println(s2.getName());
		System.out.println(s2.getMajor());
		
	}

}
