package ex_LEEJUNMOK07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex7_5_HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		해쉬맵 선언
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
//		나라, 인구 5개 입력받기
		System.out.println("나라 이름과 인구를 5번 입력하세요.(예: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String text = sc.nextLine();
			
			// 토큰으로 쪼개서 해쉬맵에 저장하기
			StringTokenizer st = new StringTokenizer(text, " ");
			while(st.hasMoreTokens()) {
				//국가
				String n = st.nextToken();
				//인구
				int p = Integer.parseInt( st.nextToken() );
				//해쉬맵에 저장
				nations.put(n, p);
			}
		
		}
		
//		가장 인구가 많은 나라 출력
		
		// 해쉬맵은 순서가 없기때문에 Iterator활용하기
			//모든 키를 set으로 저장
		Set<String> keys = nations.keySet();
			//저장한 set을 iteratior로 읽어 나갈 수 있게 만들기
		Iterator<String> it = keys.iterator();
		
		
		String maxkey = null;		//최대인구 국가명
		int maxValue = 0;		//최대인구 값
		
		// iterator를 읽어가며 최대 인구값과 최대인구 국가명을 찾아 저장하기
		while(it.hasNext()) {
			String key = it.next();
			int value = nations.get(key);
			if( maxValue < value ) {
				maxkey = key;
				maxValue = value;
			}	
		}
		// 출력하기
		System.out.println("제일 인구가 많은 나라는 (" + maxkey + ", "+ maxValue + ")");
		
	}

}
