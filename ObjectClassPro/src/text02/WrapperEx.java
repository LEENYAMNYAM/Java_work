package text02;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JAVA_WRAPPER 객체
		
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);
		
//		정수형----------------------------------------------------
		String s1 = "100";
		
		Integer i2 = Integer.parseInt(s1);
		System.out.println(i2);
		
		int i3 = Integer.parseInt(s1);
		System.out.println(i3);
		
//		실수형----------------------------------------------------
		String s2 = "3.5";
		
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
		Float f1 = Float.parseFloat(s2);
		System.out.println(f1);
		
		Double d2 = Double.parseDouble(s2);
		System.out.println(d2);
		
//		문자형----------------------------------------------------
		String s3 = "true";
		
		boolean b1 = Boolean.valueOf(s3);
		System.out.println(b1);
		Boolean b2 = Boolean.valueOf(s3);
		System.out.println(b2);
		
//		Integer 형변환----------------------------------------------------
		int i10 = i1.intValue();
		int i11=i1;
		
		String s10 = Integer.toBinaryString(i10);
		System.out.println("s10=" + s10);
		String s20 = Integer.toHexString(i10);
		System.out.println("s20=" + s20);
		String s30 = Integer.toString(i10);
		System.out.println("s30=" + s30);
//		String s40 = Boolean.toString(s3);
//		System.out.println("s40=" + s40);
		
		
		
		
		
	}
}
