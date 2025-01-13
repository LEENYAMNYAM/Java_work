package test03;

public class ArrayException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"]"+"=" +intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {                //실전에서는 주로 (Exception e)만 씀.
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
