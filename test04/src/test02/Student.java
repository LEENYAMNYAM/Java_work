package test02;

public class Student {

//	필드
	int sno;
	String name;
	String major;
	
//	생성자
	public Student() {
		this(1,"황기태","정보통신");
		System.out.println("기본 생성자");
	}
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public Student(int sno, String name, String major) {
		this.sno = sno;
		this.name = name;
		this.major = major;
	}

//	매소드
	public void display() {
		System.out.printf("%d, %s, %s%n", sno, name, major);
	}
	
	
}
