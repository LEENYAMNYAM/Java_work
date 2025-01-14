package test03;

public class Book {

//	필드
	String title;
	String author;
	String pub;
	int page;
	
//	생성자
	public Book() {}
	public Book(String title, String author, String pub, int page) {
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.page = page;
	}
	
//	메소드
	public void display() {
		System.out.println(title +", "+ author +", "+ pub +", "+ page + "쪽");
	}
	
}
