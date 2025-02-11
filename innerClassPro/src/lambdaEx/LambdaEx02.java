package lambdaEx;

interface Unit6{
	void move(String s);
}
public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit6 unit = new Unit6() {

			@Override
			public void move(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
			
		};	//선언과 구현이 한번에 되어 있음.(선언을 해야되기 때문에 ; 이 필요함.)
		unit.move("Lambda : Unit6");
		
	}

}
