package stringPro;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = " ab cd\t";
		System.out.println("|" + a + "|");
//		trim() : 좌우 가장자리 공백 제거
		System.out.println("|" + a.trim() + "|");
		
//		---------------------------------------------------
		String b = "java";
		
		System.out.println(a.length());
		System.out.println(b.length());
		
//		---------------------------------------------------
		String c = a.concat(b);
		String d = c.replace("java", "python");
		System.out.println(c);
		System.out.println(d);
		
//		----------------------------------------------------
		String s1 = "java program";
		String[] arr1 = s1.split(" ");
		System.out.println("arr1[0]=" + arr1[0]);
		System.out.println("arr1[0]=" + arr1[1]);
		
//		----------------------------------------------------
		String s2 = "java,program";
		String[] arr2 = s2.split(",");
		System.out.println("arr2[0]=" + arr2[0]);
		System.out.println("arr2[0]=" + arr2[1]);
		
//		-----------------------------------------------------
		String s3 = s2.substring(5,8);
		System.out.println("s3=" + s3);
		System.out.println(s3.charAt(0));		
		System.out.println(s3.charAt(1));
		System.out.println(s1.codePointAt(1));
		
//		-----------------------------------------------------
		//,의 위치 가 몇번째 놈인지 찾아 줌
		System.out.println(s2.indexOf(","));
		//없을땐 -1로 출력
		System.out.println(s1.indexOf(","));
		// 마지막 ,가 몇번째 놈인지 찾아줌
		System.out.println(s2.lastIndexOf(","));
		
		String s4 = "java,program,python";
		System.out.println(s4.substring(s4.indexOf(",")+1, s4.lastIndexOf(",")));
		
//		-----------------------------------------------------
		//가비지가 많이 쌓이게 됨.
		String ss = "";
		for(int i=0; i<100; i++) {
			ss+=i;
		}
		
		
	}

}
