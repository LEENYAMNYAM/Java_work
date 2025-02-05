package ex_LEEJUNMOK07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7_2_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		학점 5개 입력(A,B,C,D,F)
		System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		String text = sc.nextLine();
		
//		띄어쓰기를 구분자로 5개의 토큰으로 나누고 ArrayList에 저장
		StringTokenizer st = new StringTokenizer(text, " ");		
		while( st.hasMoreTokens() ) {
			a.add( st.nextToken().charAt(0) );
		}
		
//		등급에 따라 ASKII번호를 이용하여 점수 출력
		for(int i=0; i<a.size(); i++) {
			if(a.get(i) == 'F') {
				System.out.print((double)(71-(int)(a.get(i)))+ " ");
			}	
				System.out.print((double)(70-(int)(a.get(i)))+ " ");
		}
		
		sc.close();
	}

}
