package test01;

import java.util.ArrayList;
import java.util.Scanner;

import collectionPro.Student;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1,"유재석", "컴공", 95));
		a.add(new Student(2,"유연석", "멀티미디어", 85));
		a.add(new Student(3,"안유진", "컴공", 80));
		a.add(new Student(4,"장원영", "정컴", 90));
		a.add(new Student(5,"고윤하", "기계", 70));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("학번입력>>");
			int sno = sc.nextInt();
			if(sno == 0) {
				System.out.println("시스템 종료");
				break;
			}
			
			boolean flag = false;
			
			for(int i=0; i<a.size(); i++) {
				Student s = a.get(i);
				if(s.getSno() == sno) {
					System.out.println(s);
					flag=true;
					break;
				}else {

				}
			}
			if(!flag){
			System.out.println("찾는 데이터가 없음");
		
			}
	
		}
		sc.close();
	}

}
