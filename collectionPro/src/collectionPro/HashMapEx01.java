package collectionPro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		선언
		HashMap<String, String> h = new HashMap<>();
		
//		데이터값 추가
		h.put("baby", "아기");
		h.put("love", "사랑");
		h.put("apple", "사과");
		
//		개별 데이터 값 추력
		System.out.println(h.get("baby"));

//		모든 키 집합으로 출력
		Set<String> keys = h.keySet();
	
			
		/* HashMap은 구조적으로 for문으로 여러 데이터값들을 가져오기 힘듦
		for(int i=0; i <h.size();i++){
			System.out.println(h.get(i));
		}
		*/
		
//		때문에 Iterator를 활용함.
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + "=>" + value);
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("찾고 싶은 단어를 입력하세요.>>");
			String eng =sc.next();
			String kor = h.get(eng);
			if(kor == null) {
				System.out.println("는 등록되지 않은 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
		
		
	}

}
