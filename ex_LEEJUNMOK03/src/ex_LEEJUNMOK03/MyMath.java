package ex_LEEJUNMOK03;

//	<문제 5번>
//	(2) 

public class MyMath {
	public int getRandom() {
		return(int)Math.random();   
	}
	public double getrandomDouble() {   
//		오류1 : 메소드 오버로딩(같은 이름으로 여러개의 메소드를 만드는것)은 
//			   파라미터의 데이터형이나 개수가 달라야하는것이므로,
//			   return 값의 형이 다른것으로는 오버로딩이 되지 않는다. 
//			   때문에 메소드 이름을 getrandomDouble로 바꾸어 주었음.
		return Math.random();
	}
	
}
