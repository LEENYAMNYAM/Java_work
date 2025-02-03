package ex_LEEJUNMOK03;

import java.util.Scanner;

//	7번 문제
class BankAccount{

//	필드	
	private String accountNumber;
	private String owner;
	private int balance;

//	생성자
	public BankAccount() {
	}
	public BankAccount(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
		
//	setter&getter
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
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
	public void deposit(int deposit1) {
		this.balance += deposit1;
		System.out.println(deposit1 + "원이 입금되어 현재 계좌에 "+ this.balance + "원이 남았습니다.");		
	}
	
	public void withdraw(int widthdraw1) {
		this.balance -= widthdraw1;
		System.out.println(widthdraw1 + "원이 인출되어 현재 계좌에 "+ this.balance + "원이 남았습니다.");
	}
	public void transfer(int transfer1, BankAccount otherAccount) {
			if(transfer1 > this.balance) {
				System.out.println("잔액보다 더 많은 금액은 이체가 불가능 합니다.");
			}else if(transfer1 <= 0){
				System.out.println("양의 정수값을 입력해주세요.");
			}else if(this.balance <= 0){
				System.out.println("계좌 잔액이 0원이므로 이체가 불가능 합니다.");
			}else {
				this.balance -= transfer1;
				otherAccount.balance += transfer1;
				System.out.println(transfer1 + "원이 이체되어 현재 계좌에 " + this.balance + "원이 남았습니다.");
		    }
	}
	
}


public class Ex07_BackAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount("1000-11111", "홍길동", 100000);
		BankAccount otherAccount = new BankAccount("1000-22222", "이준목", 100000);
		
		
		while(true) {
			System.out.println("홍길동님 환영합니다. 무엇을 도와 드릴까요?");
			System.out.println();
			System.out.println("---------------------  A T M  -----------------------");
			System.out.println("1. 입금   | 2. 출금   | 3. 잔액조회  | 4. 이체   | 5. 종료  ");
			System.out.println("---------------------  A T M  -----------------------");
			System.out.print("원하시는 번호를 입력하세요>>");
			
			int Num = -999;
			
			try{
//				번호 선택
				Num = sc.nextInt();
			}catch(Exception e){
//				문자입력 방지
				System.out.println("정수를 입력해 주시기 바랍니다.");
				continue;
			}
			
			if(Num == 5) { 
//			시스템 종료 선택 시 
				System.out.println("시스템을 종료합니다.");
				break;
			
			}else if(Num == 4) {
//			이체 선택 시
				System.out.println("계좌번호 : 1000-22222(예금주 : 이준목) 님께 이체합니다.");
				System.out.print("얼마를 이체할지 입력하세요.");
				int transfer1 = -999;
				try{
//					출력할 금액 입력받기
					transfer1 = sc.nextInt();
				}catch(Exception e){		
//					문자입력 방지
					System.out.println("정수를 입력해 주시기 바랍니다.");
					continue;
				}
				if(transfer1 <= 0) {
//					음수&0 입력 방지
					System.out.println("양의 정수를 입력해주세요.");
				}else {
//					올바른 이체값 입력 시
					account.transfer(transfer1, otherAccount);
				}
				
				
			}else if(Num == 3){
//			잔액조회 선택 시 
				System.out.print("홍길동님의 계좌 잔액을 조회합니다.");
				System.out.println("계좌 잔액 : " + account.getBalance() );
			
			}else if(Num == 2){
//			출금(출금액입력받기) 선택 시 
				int withdraw1 = -999;
				System.out.println("출금할 금액을 입력하세요.");

				try{
//					출력할 금액 입력받기
					withdraw1 = sc.nextInt();
				}catch(Exception e){		
//					문자입력 방지
					System.out.println("정수를 입력해 주시기 바랍니다.");
					sc.nextLine(); // 버퍼 비우기
					continue;
				}
				if( withdraw1 > account.getBalance() ) {
//					보유액보다 클 때
					System.out.println("잔액보다 큰 금액을 입력하셨습니다.");
				}else if(withdraw1 < 0) {
//					음수값을 입력했을 때
					System.out.println("음수값은 출금 할 수 없습니다.");
				}else{
//					올바른 인출액을 입력했을 때
					account.withdraw(withdraw1);
				}
				
//			입금	선택 시 
			}else if(Num == 1) {
				int deposit1 = -999;
                System.out.println("입금할 금액을 입력하세요.");
				try{
//					입금액 입력
					deposit1 = sc.nextInt();
				}catch(Exception e){		
//					문자입력 방지
					System.out.println("정수를 입력해 주시기 바랍니다.");
                    sc.nextLine(); // 버퍼 비우기
					continue;
				}
				if(deposit1 <= 0) {
					System.out.println("양의 정수를 입력해주세요.");
				}else {
					account.deposit(deposit1);
				}
//			번호를 잘못 입력했을 떄	
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		
		}
		sc.close();
	}

}
