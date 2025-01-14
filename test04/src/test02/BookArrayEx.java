package test02;

import java.util.Scanner;

class Book{
	
//	필드
	String title, author;
	
//	생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
//	매소드
	public void display() {
		System.out.println(title + ", "+ author);
	}	
}

public class BookArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] books = new Book[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < books.length ; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
		}
		
		for (Book book : books) {
			book.display();
		}
		sc.close();
	}

}
