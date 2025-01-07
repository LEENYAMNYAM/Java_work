package arraypro;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		변수는 초기값설정안하면 에러가 나지만,
//		배열은 초기값이 자동으로 설정됨.
//		int는 0, double은 0.0, char은 공백이 설정됨.
		
		int[] intArray;
		intArray=new int[10];
		char[] chArray=new char[26];
		double dArray[]= new double[10];
		
		int testArray[]= {1,2,3,4,5};
		
//		위의 의미는 다음과 같은 의미이다.
//		testArray=new int[5];
//		testArray[0]=1;
//		testArray[1]=2;
//		testArray[2]=3;
//		testArray[3]=4;
//		testArray[4]=5;
		
		for(int i=0; i<10; i++) {
			System.out.println(dArray);
			System.out.println(dArray[i]);
		}
		
		char ch='A';
		for(int i=0; i<26; i++) {
			chArray[i]=ch++;
			System.out.println(chArray);
			System.out.println(chArray[i]);
		}
		System.out.println();
		System.out.println(chArray+"4444444444");
		System.out.println(chArray);  
		
//		intArray[0]=10;
//		intArray[5]=20;
//		intArray[9]=60;
//		intArray[10]=100;      //9까지이기 때문에 에러가 남.
		
		for(int i=0; i<10; i++) {
			System.out.println(intArray);
			System.out.println(intArray[i]);
		}
		
//		[I@7eda2dbb
//		[D@7eda2dbb
//		주소인가보다 하는데 왜 char은 주소가 아니라 데이터가 나오는가?
//		@뒤에 16진수법으로 표현됨.
//		char은 하나의 String이므로 배열.

//		char[] chArray=new char[26];
//		double dArray[]= new double[10];
//		두개는 완전히 차이가 없음.(자바만드는 사람이 의미상 형선언에 쓰는게 맞지 않냐하면서 바꾼거임)
		
		
		
	}
}
