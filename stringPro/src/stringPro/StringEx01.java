package stringPro;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "java";
		String s3 = "abcd";
		String s4 = new String("abcd");
		String s5 = new String("java");
		String s6 = new String("java");
		char[] ch = {'a', 'b', 'c', 'd'};
		String s7 = new String(ch);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s7));
		System.out.println(s1.compareTo(s6));
		System.out.println(s6.compareTo(s1));
		
		System.out.println("-----------------------------------------");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s4==s7);
		System.out.println(s4.equals(s7));
				
	}

}
