package arraypro;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		
//		같은 스택을 사용하고 같은 주소값을 가지게 됨.
		int myArray[] = intArray;
		
//		때문에 한쪽의 배열값을 바꾸게 되면 같은 주소에 있는 값이 바뀌는것이기 때문에
//		둘다 같은 값을 출력하게 된다.
		
		intArray[0]=10;
		System.out.println(myArray[0]);
		myArray[0]=20;
		System.out.println(intArray[0]);
	
	}

}
