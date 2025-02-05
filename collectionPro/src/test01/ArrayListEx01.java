package test01;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList 선언
		ArrayList<Integer> a = new ArrayList<>();
		
//		값 추가
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(0,2);
		
//		전체 데이터값 출력
		System.out.println(a);
//		개별 데이터값 출력
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
//		값 제거 : 정수형은 값을 적어서 삭제할 수 없음.
		a.remove(0);
		
//		개수 : ArrayList는 capacity 함수가 없음.
		System.out.println(a.size());
		
		
	}

}
