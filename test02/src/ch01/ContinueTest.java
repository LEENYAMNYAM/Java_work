package ch01;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0)
				continue;
			sum+=i;
			System.out.println("i="+i+", sum=" + sum);
		}
		System.out.println("sum=" + sum);
	}

}
