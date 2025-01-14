package test02;

import java.util.Scanner;

public class PersonObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons = new Person[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < persons.length ; i++) {
			System.out.println("이름 입력 : ");
			String name = sc.next();
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			System.out.println("성별 입력 : ");
			String gender = sc.next();
			persons[i] = new Person(name, age, gender);
		}
		for(Person p : persons) {
			p.display();
		}
		
	}

}
