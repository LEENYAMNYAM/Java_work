package ch02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 소문자 알파벳을 1개 입력하세요. ");	
		String input = sc.next();
		int ch=input.charAt(0);
//		System.out.println(input);
		
		int output = (ch - 32);
		
		System.out.println((char)output);		
		sc.close();
		
	}

}