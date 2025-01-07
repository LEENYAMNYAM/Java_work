package ch01;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		
		do {
			sum+=num;
			num++;
			System.out.println("num="+num);
			System.out.println("sum="+sum);  // Do-While은 처음 한번을 무조건 수행하게 됨.
		}while(num<=10);
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		
	}

}
