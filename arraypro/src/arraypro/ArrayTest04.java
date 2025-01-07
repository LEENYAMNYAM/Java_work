package arraypro;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10,73,8,45,52};
		System.out.println(intArray.length);

		int max=-999;
		
		for(int num:intArray) {
			if(num>max){
				max=num;
			}
		}
		System.out.println(max);
		
		max=-999;
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] > max) {
				max=intArray[i];
			}		
		}
		System.out.println(max);
		
		int sum=0;
		for(int i=0; i<intArray.length;i++) {
			sum+=intArray[i];
		}	

//		더블로 avg를 선언했지만, sum/intArray.length가 정수로 계산이 되어버리기 때문에, 소수점 아래가 0이 됨.
		double avg=sum/intArray.length;	
		System.out.println(avg);
		
//		소수점아래까지 정확하게 구하고 싶다면, sum이나 intArray.length를 정수로 바꾸어야 함.
		avg= (double)sum/intArray.length;	
		System.out.println(avg);
		
		sum=0;
		for(int num:intArray) {
			sum+=num;
		}
		
		avg= (double)sum/intArray.length;	
		System.out.println(avg);
		
	}

}
