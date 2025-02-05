package collectionPro;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<>();
		map.put("유재석", "010-1111-1111");
		map.put("안연석", "010-2222-2222");
		map.put("안유진", "010-3333-3333");
		map.put("장원영", "010-4444-4444");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("전화번호를 검색할 이름 입력>>");
			String name = sc.next();
			if(name.equals("quit")) {
				break;
			}
			String number = map.get(name);
			if(number == null)
				System.out.println("동록된 데이터가 없음.");
			else
				System.out.println(number);
		}
		
	}

}
