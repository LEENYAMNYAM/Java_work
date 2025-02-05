package ex_LEEJUNMOK05;

public class Ex06_4_Phone {
	
//	필드
	private String product;
	private int price;
	private String transType;
	
// 생성자
	public Ex06_4_Phone() {
	}
	public Ex06_4_Phone(String product, int price, String transType) {
		this.product = product;
		this.price = price;
		this.transType = transType;
	}
	
//	getter & setter
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	
//	메소드
	public void Print() {
		System.out.printf("제조사 : %s \t 가격 : %d \t 통신타입 : %s \t", product, price, transType);
	}
	
	
}
