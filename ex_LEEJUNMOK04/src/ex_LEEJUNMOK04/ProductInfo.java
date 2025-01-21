package ex_LEEJUNMOK04;

import java.util.Scanner;

public class ProductInfo {

	static Scanner sc = new Scanner(System.in);
	
	static int id=1;
	
	static Product input() {
		Product p=null;
		
			System.out.print("상품의 종류 선택 : 1 책 | 2 앨범 | 3 회화책 >>");
			int num = sc.nextInt();
			
			System.out.print("상품설명>>");
			sc.nextLine();
			String comment = sc.nextLine();
			System.out.print("생산자>>");
			String productor = sc.nextLine();
			System.out.print("가격>>");
			int price = sc.nextInt();
			switch(num) {
				case 1:
					System.out.print("작가>>");
					sc.nextLine();
					String author = sc.nextLine();
					System.out.print("제목>>");
					String bookTitle = sc.nextLine();
					p=new Book(id++, comment, productor, price, author, bookTitle);
					break;
				case 2:
					System.out.print("가수>>");
					sc.nextLine();
					String singer = sc.nextLine();
					System.out.print("앨범제목>>");
					String albumTitle = sc.nextLine();
					p=new CompackDisc(id++, comment, productor, price, albumTitle, singer);
					break;
				case 3:
					System.out.print("작가>>");
					sc.nextLine();
					author = sc.nextLine();
					System.out.print("제목>>");
					bookTitle = sc.nextLine();
					System.out.print("언어>>");
					String language = sc.next();
					p=new ConversationBook(id++, comment, productor, price, author, bookTitle, language);
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
			}
			return p;
		}
	
	static void search(Product[] products, int k) {
		
		boolean flag = false;
		
		System.out.println("상품 아이디>>");
		int id = sc.nextInt();
		for (int i=0; i<k ;i++)
			if(products[i].getId()==id) {
				products[i].display();
				System.out.println();
				flag=true;
				break;
		}
		if(!flag) {
			System.out.println("찾으시는 상품이 없습니다.");
		}
		
	}
	
	static void show(Product[] products, int k) {
		for (int i=0; i<k; i++) {
			products[i].display();
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] products = new Product[10];
		int num = -999; 
		int k = 0;
		boolean flag = false;
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1 상품추가 | 2 상풍조회 | 3 모든 상품조회 | 4 끝내기");
			System.out.println("------------------------------------------");
			
			try {
				num = sc.nextInt();
			}catch(Exception e) {
				System.out.println("1 ~ 4까지의 자연수를 입력해 주시기 바랍니다.");
				continue;
			}
			
			switch(num) {
				case 1 : products[k++] = input(); break;
				case 2 : search(products, k); break;
				case 3 : show(products, k); break;
				case 4 : flag =true; break;
				default:
					System.out.println("번호를 잘못 입력했습니다.");
			}
			
			if(flag) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
	}	

}
