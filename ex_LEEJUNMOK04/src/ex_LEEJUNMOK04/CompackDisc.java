package ex_LEEJUNMOK04;

public class CompackDisc extends Product{
//	필드
	private String albumTitle;
	private String singer;
	
//	생성자
	public CompackDisc() {
	}
	public CompackDisc(int id, String comment, String productor, int price, 
			    String albumTitle, String singer) {
		super(id, comment, productor, price);
		this.albumTitle = albumTitle;
		this.singer = singer;
	}	
	
//	메소드
	public void display() {
		super.display();
		System.out.print(albumTitle + "\t");
		System.out.print(singer + "\t");
	}
	
}
