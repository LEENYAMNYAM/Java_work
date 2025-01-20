package packagepro;

public class Student {
//	필드
	private int sno;
	private String name;
	private String major;
	static int count;
	
//	생성자
	public Student() {
		count++;
		System.out.println("default 생성자");
	}
	public Student(int sno, String name, String major) {
		this.sno = sno;
		this.name =name;
		this.major = major;
		count++;
	}
	
//	setter
	public void setSno(int sno) {
		this.sno=sno;	
	}
	public void setName(String name) {
		this.name=name;	
	}
	public void setMajor(String major) {
		this.major=major;	
	}
	
//	getter
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public static int getCount() {
//		this.name = "aa";		
	// static 함수는  Student 클래스에서 이미 만들어진 함수인데, 
	// static 변수가 아닌 객체 변수 name은 아직 선언되지 않았기 때문에 메모리에 할당되지 않아서 static 함수와 함께 쓸 수 없다
	// 즉, static 함수는 static 변수랑만 쓸 수 있다.	
		return count;
	}
	
//	method
	
}
