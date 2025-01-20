package packagepro;

class Calc{
	public static int abs(int a) {
		return a>0 ? a : -a;
	}
	
	public static int max(int a, int b) {
		return a>b ? a : b; 
	}
	
	public static int min(int a, int b) {
		return a<b ? a : b;
	}
	
}
	

public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calc.abs(-10));
		System.out.println(Calc.max(10, 5));
		System.out.println(Calc.min(10, 5));
		
	}

}
