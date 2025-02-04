package collectionPro;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <4; i++) {
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			a.add(name);
		}
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------");
//		가장 긴 이름을 출력
		int MaxIndex =0;
		for(int i =1; i < a.size(); i++) {
			if(a.get(MaxIndex).length()<a.get(i).length()) {
				MaxIndex = i;
			}
		}
		System.out.println("가장 긴 이름은 = " +  a.get(MaxIndex));
	}

}
