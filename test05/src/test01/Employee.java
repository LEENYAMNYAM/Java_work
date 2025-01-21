package test01;

public class Employee extends Person{
//	필드
	private int eno;
	private String dept;
	private String position;
	private int sal;
	
//	생성자
	public Employee() {}
	public Employee(int eno, String name, int age, String gender, String dept, String position, int sal) {
		super(name, age, gender);
		this.eno = eno;
		this.dept = dept;
		this.position = position;
		this.sal = sal;
	}
	
//	메소드
	public void show() {
		
		System.out.printf("%d, ", eno);
		super.show();
		System.out.printf(", %s,  %s,  %d%n", dept, position, sal );
	}
	
}
