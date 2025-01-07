package arraypro;

public class MultiArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = new int[4][];
		
		nums[0]= new int[2];
		nums[1]= new int[1];
		nums[2]= new int[3];
		nums[3]= new int[4];
		
		for(int i=0; i < nums.length; i++) {
			for(int j=0; j < nums[i].length; j++) {
				nums[i][j] = i+j;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
//		비정방형 배열 연습문제
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i = 0 ; i < intArray.length ; i++) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				intArray[i][j]=(i+1)*10+j;
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
