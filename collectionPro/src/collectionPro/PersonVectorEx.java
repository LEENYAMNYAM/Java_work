package collectionPro;

import java.util.Scanner;
import java.util.Vector;

public class PersonVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
//		객체 5개 입력하기
		for(int i=0; i<5; i++) {
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			System.out.print("나이를 입력하세요>>");
			int age = sc.nextInt();
			System.out.print("성별을 입력하세요>>");
			String gender = sc.next();
			v.add(new Person(name, age, gender));
		}
		
//		v.add(new Person("홍길동", 20, "남자"));
//		v.add(new Person("공유", 45, "남자"));
//		v.add(new Person("안유진", 23, "여자"));
//		v.add(new Person("아이유", 30, "여자"));
//		v.add(new Person("유재석", 50, "남자"));
		
//		전체 내용 출력
		System.out.println("입력된 전체 내용을 출력합니다.");
		for(int i=0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
//		이름을 검색하여 출력하기
		String ename;
		int index = -999 ;
		
		while(true) {
			System.out.println("출력하고 싶은 이름을 입력하세요. 종료를 원하시면 exit를 입력하세요.");
			ename = sc.next();
			// 입력값이 exit일 경우
			if(ename.equals("exit")) {
			System.out.println("시스템을 종료합니다.");
			break;
			}
			//맞는 이름이 있는지 찾기
			for(int i=0; i < v.size(); i++) {
				if(ename.equals( v.get(i).getName() )){
					//맞는 이름의 인덱스값 가져오고 for문 탈출
					index = i;
					break;
				}else {	
					// 맞는 이름이 없으면 인덱스값 -999로 만들어주기
					index = -999;
				}
			}
			//입력값과 같은 이름이 없으면 다시 입력 요구
			if(index==-999) {
				System.out.println("찾으시는 이름이 없습니다.");
			}else {
			//맞는 이름이 있을 시 해당 객체 전체 내용 출력
			System.out.println(v.get(index));
			}
		}
		
	}

}
