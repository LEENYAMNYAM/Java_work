package stringPro;

public class StirngBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("This");
		System.out.println(s.hashCode());
		s.concat(" is pencil");
		System.out.println(s.hashCode());
//		s의 해쉬코드가 다르다른 것은 새로운 객체를 만들어서 가리킨다는 의미
		
		StringBuffer sp = new StringBuffer("This");
		System.out.println(sp.hashCode());
		sp = sp.append(" is pencil");
		System.out.println(sp.hashCode());
//		sp의 해쉬코드가 바뀌지 않았다는 것은 똑같은 객체를 가리킨다는 의미
		
		sp=sp.insert(7, " my");
		System.out.println(sp);
		sp=sp.replace(8, 10, "your");
		System.out.println(sp);
		System.out.println(sp.hashCode());
//		StringBuffer 로 만들었기 때문에 해쉬코드가 여전히 바뀌지 않음.
		String ss = sp.toString();
		System.out.println(ss);
//		변경이 완료되면 새로운 스트링으로 저장하는 편임.
		
	}

}
