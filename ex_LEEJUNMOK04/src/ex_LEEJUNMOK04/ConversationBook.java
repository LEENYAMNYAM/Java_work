package ex_LEEJUNMOK04;

public class ConversationBook extends Book{
//	필드
	private String language;
	
//	생성자
	public ConversationBook() {
	}
	public ConversationBook(int id, String comment, String productor, int price, 
		    String author, String bookTitle,
		    String language) {
		super(id, comment, productor, price, author, bookTitle);
		this.language = language;
	}
	
//	메소드
	public void display() {
		super.display();
		System.out.print(language + "\t");
	}
	
}
