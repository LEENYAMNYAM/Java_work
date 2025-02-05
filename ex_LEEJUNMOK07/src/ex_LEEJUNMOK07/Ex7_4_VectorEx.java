package ex_LEEJUNMOK07;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex7_4_VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		vector 선언
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
//		1년단위의 키를 입력받기
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력(구분자는 띄어쓰기)");
		System.out.print(">>");
		String heightLine = sc.nextLine();
	
//		띄어쓰기를 구분자로 10개의 토큰으로 나눠서 벡터에 저장
		StringTokenizer st = new StringTokenizer(heightLine, " ");
		while(st.hasMoreTokens()) {
		
			v.add( Integer.parseInt( st.nextToken() ) );
		}
			
//		가장 많이 자란 년도 찾기
			
		double maxYear = 0;
		
		for(int i=1; i < v.size(); i++) {
//			자란 키 길이 구하기
			int gap = v.get(i) - v.get(i-1);
			if( maxYear < gap ) {
				maxYear = gap;
			}
		}
		
		System.out.println("가장 키가 많이 자란 년도는 : " + (int)(maxYear+2000) + "년 "+ maxYear + "cm");
		sc.close();
	}
		
}
