package test03;

import java.util.Scanner;

public class BookTest {
	static Scanner sc = new Scanner(System.in);
	
	static Book add() {
		
		System.out.print("제목>>");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("작가>>");
		String author = sc.nextLine();
		System.out.print("출판사>>");
		String pub = sc.nextLine();
		System.out.print("페이지수>>");
		int page = sc.nextInt();
		
		Book b = new Book(title, author, pub, page);
		return b;	
	}
	static void list(Book[] books, int k) {
		for(int i=0 ; i<k ; i++) {
			books[i].display();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[10];
		
		boolean flag = false;
		int k=0;
		while(true) {
			System.out.println("1.추가, 2.목록보기, 3.종료");
			int num = sc.nextInt();
			switch(num) {
				case 1:books[k++]=add(); break;
				case 2:list(books, k); break;
				case 3:flag=true; break;
				default : 
					System.out.println("입력오류");
			}
			if(flag || k==10) break;
			
		}
		System.out.println("end!!");
		
		
		
	}

}
