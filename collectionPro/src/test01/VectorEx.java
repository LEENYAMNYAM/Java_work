package test01;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Vector 선언 
		Vector<String> v = new Vector<>();
		
//		값추가
		v.add("홍길동");
		v.add("김소정");
		v.add(1, "지정우");
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		
//		값 삭제
		v.remove(0);
		v.remove("김소정");
		
//		개수파악/용량파악
		System.out.println(v.size());
		System.out.println(v.capacity());
		
	}

}
