package test02;

public class Person {

//	필드
	String name;
	int age;
	String gender;
	
//	생성자
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//	setter
	public void setName(String name) {
		this.name = name;
	}
	
//	메소드
	public void display() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
	}
	public boolean nameEqual(Person p) {
		if(this.name.equals(p.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
