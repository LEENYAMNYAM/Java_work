package ex_LEEJUNMOK03;

import java.util.Scanner;

//	7번 문제
class BankAccount{

//	필드	
	private int accountNumber;
	private String owner;
	private int balance;

//	생성자
	public BankAccount() {
	}
	public BankAccount(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
		
//	setter&getter
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	메소드
	public void deposit() {
		
	}
	public void withdraw() {
		
	}
	public int transfer(int amount, BankAccount, otherAccount) {
		
	}
	
}




public class Ex07_BackAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		
		while(true) {
			System.out.println("----------------현금출력기------------------");
			System.out.println("1. 입금   | 2. 출금   | 3. 잔액조회 | 4. 종료  ");
			System.out.println("----------------현금출력기------------------");
			System.out.print("원하시는 번호를 입력하세요>>");
			
			int Num = -999;
			
			try{
				Num = sc.nextInt();
			}catch(Exception e){
				System.out.println("정수를 입력해 주시기 바랍니다.");
				continue;
			}
			
			if(Num == 4) { 
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(Num == 3){
				System.out.println("현재 잔액 : " + ba.getBalance());
			}else if(Num == 2){
				
			}else if(Num == 1) {
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		
		
		
		}
		
	}

}
