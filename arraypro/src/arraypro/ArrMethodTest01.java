package arraypro;

public class ArrMethodTest01 {
	
	static int[] makeArray() {
		int arr[] = {1,2,3,4,5};
		return arr;
	}
	
	static void showArray(int[] arr) {
		for(int num : arr) {
			System.out.println(num);
		}
	}
	
	static void changeArray(int[] arr) {
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] +=10;
		}
	}
	
	static int sum(int a, int b) {
		a+=10;
		System.out.println("함수안의 a값 : " + a);
		return a+b;
	}
	
//	배열의 주소만 받는데 어떻게 배열값들을 다 받는가?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = makeArray();
//		배열을 그대로 출력하는 메소드
		showArray(intArray);
//		배열값에 10씩 더 해주는 메소드
		changeArray(intArray); 
//		다시 배열을 출력해보면 10씩 더해진 값이 저장되어 있는 것을 확인가능
		showArray(intArray);
		
//		for(int num : intArray ) {
//			System.out.println(num);
//		}
	
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		System.out.println(result);
		System.out.println("메인 메소드의 num1값 : " + num1);
	}
}


