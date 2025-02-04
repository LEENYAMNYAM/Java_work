package collectionPro;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		객체 5개 입력하기
		for(int i=0; i<5; i++) {
			System.out.print("학번을 입력하세요>>");
			int sno = sc.nextInt();
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			System.out.print("전공을 입력하세요>>");
			String major = sc.next();
			System.out.print("점수를 입력하세요>>");
			int score = sc.nextInt();
			a.add(new Student(sno, name, major, score));
		}
		
/* 		
  		1	홍길동	컴공	50
		2	안유진	정컴	80
		3	유재석	기계	85
		4	아이유	수학	77
		5	공유		통계	65
*/
		
//		전체 내용 출력
		System.out.println("입력된 전체 내용을 출력합니다.");
		for(int i=0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}		
		
//		점수가 가장 높은 사람의 정보를 출력
		int MaxIndex = 0;
		for(int i = 1; i<a.size(); i++) {
			if(a.get(MaxIndex).getScore()<a.get(i).getScore()) {
				MaxIndex = i;
			}
		}
		System.out.println("점수가 가장 높은 사람은 : " + a.get(MaxIndex));
	}

}
