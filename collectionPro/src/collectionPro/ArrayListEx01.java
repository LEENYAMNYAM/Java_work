package collectionPro;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
//		요소 추가
		a.add("hello");
		a.add("Hi");
		a.add("Java");
		a.add(1,"사과");
		// ArrayList 출력
		for(int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("--------------------------------");
//		요소 삭제
		a.remove(0);
		// ArrayList 출력
		for(int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("--------------------------------");
//		요소(데이터값이용해서) 삭제
		a.remove("Hi");
		// ArrayList 출력
		for(int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i));
		// 숫자(Integer일때는 index와 object구분이 불가능하기때문에 object(데이터값)을 넣어서 삭제가 불가능 하지만, 문자(String)는 구분되기 때문에 가능
		}
		
		System.out.println("--------------------------------");
//		요소 포함여부 확인
		System.out.println(a.contains("사과"));
		System.out.println("--------------------------------");
		
//		ArrayList를 통으로 받으려면 Object형으로 받으면 받아짐.
		Object[] arr=(a.toArray());
		// ArrayList 출력
			for(int i = 0; i <a.size(); i++) {
				System.out.println(a.get(i));
			}		
		System.out.println("--------------------------------");
//		모든 요소 삭제
		a.clear();
		System.out.println(a.isEmpty());
		// ArrayList 출력
		for(int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i));
		//모두 출력해도 clear되었기 때문에 아무것도 없음.
		}
		System.out.println("--------------------------------");

	}

}
