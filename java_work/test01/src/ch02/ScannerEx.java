package ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean single = sc.nextBoolean();
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);	
		sc.close();	
	}

}
