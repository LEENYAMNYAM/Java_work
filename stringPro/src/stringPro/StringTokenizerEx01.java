package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		STRINGTOKENIZER 사용
		String query = "name=kitae&addr=seoul&age=21&=abcd";
		StringTokenizer st = new StringTokenizer(query, "=&");  // =,&,=&,&=을 모두 구분자로 분류해줌
		int count = st.countTokens();
		System.out.println("token count : " + count);
		
		//토큰이 있을 동안
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("-----------------------------------------------------------");
		
//		SPLIT 사용
		String[] arr = query.split("&");   // STRINGTOKENIZER 처럼 구분자를 여러개를 동시에 적용할 수 없음.
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}	
		
	}

}
