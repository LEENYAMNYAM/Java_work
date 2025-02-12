package testPro;

import java.util.Scanner;

public class Exam02_PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = null;
		String tel = null;
		String address = null;
		int num = 0;

		System.out.print("인원수 >> ");
		num = sc.nextInt();
		
		Phone[] p = new Phone[num];
		
		for(int i = 0; i<num ; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			name = sc.next();
			tel = sc.next();
			address = sc.next();
			p[i] = new Phone(name, tel, address);
		}
		System.out.println("저장되었습니다...");	
		while(true) {
			System.out.print("검색할 이름 >> ");
			name = sc.next();
			//exit입력시 프로그램 종료
			if(name.equals("exit")) break;
			
			//찾는 이름이 있는지 확인
			boolean flag = false;  // 찾는 이름이 있으면 true로 전환
			
			for(int i=0; i<num; i++) {
				if( name.equals( p[i].getName() )  ) {
					flag = true;
					p[i].print();
					System.out.println();
				}
			}	
			if(!flag) System.out.println(name + "은(는) 없습니다.");
			flag = false;
		}
		System.out.println("프로그램을 종료합니다...");
		
	}

}
