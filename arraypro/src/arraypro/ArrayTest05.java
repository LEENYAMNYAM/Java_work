package arraypro;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = new int[10];
		
//		Math.random() : 0이상~1미만의 실수를 랜덤하게 발생시킴
//		int num=(int)(Math.random()*100)+1;  //1~100사이의 수를 랜덤하게 발생시킴
//		System.out.println(num);
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i]=(int)(Math.random()*100)+1;
			System.out.println(numArray[i]);
		}
		
		for(int num:numArray) {
			num+=10;
			System.out.println(num);
		}
			
	}

}
