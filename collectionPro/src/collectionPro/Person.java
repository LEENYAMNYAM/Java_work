package collectionPro;

public class Person {
//	필드
	private String name;
	private int age;
	private String gender;

//	생성자
	public Person() {
		super();
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

//	setter&getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	메소드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + " " +  gender;
	}

}
