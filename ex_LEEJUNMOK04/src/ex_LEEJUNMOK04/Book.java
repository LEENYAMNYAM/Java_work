package ex_LEEJUNMOK04;

public class Book extends Product{
//	필드
	private String author;
	private String bookTitle;
	
//	생성자
	public Book() {
	}
	public Book(int id, String comment, String productor, int price, 
			    String author, String bookTitle) {
		super(id, comment, productor, price);
		this.author = author;
		this.bookTitle = bookTitle;
	}	
	
//	메소드
	public void display() {
		super.display();
		System.out.print(author + "\t");
		System.out.print(bookTitle + "\t");
	}
	
}
