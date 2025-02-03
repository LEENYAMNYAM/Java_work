package ex_LEEJUNMOK03;


//	6번 문제

class Book {

//	필드
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
//	생성자
	public Book() {}

	public Book(String title, String author, String publisher, String sort) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}

	public Book(String title) {
		this.title = title;
	}
	
//	setter&getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

//	메소드
	public void print() {
		System.out.printf("%-10s\t%s\t%s\t%s", title, author, publisher, sort);
		System.out.println();
	}
}

//메인 클래스
public class Ex06_BookEx {
	public static void main(String[] args) {
	
	System.out.println("제목" + "\t\t" + "저자" + "\t" + "출판사" + "\t" + "분류");	
	
	Book b1 = new Book("82년생 김지영", "조남주", "민읍사", "소설");
	Book b2 = new Book("파리아파트", "기욤 뭐소", "밝은세상", "소설");
	Book b3 = new Book("자료구조", "이자료", "DB출판사", "컴퓨터/IT");
	
	b1.print();
	b2.print();
	b3.print();
	
	    }
}
	
	
	

