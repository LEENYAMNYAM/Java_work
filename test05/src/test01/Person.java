package test01;

public class Person{
//	필드
	private String name;
	private int age;
	private String gender;
//	생성자
	public Person() {
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//	메소드
	public void show() {
		System.out.print(name + ", " + age + ", " + gender);
	}
	
}


