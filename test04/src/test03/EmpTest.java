package test03;

import java.util.Scanner;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	
	static Employee add() {
		System.out.print("사번>>");
		int eno = sc.nextInt();
		System.out.print("name>>");
		String name = sc.next();
		System.out.print("dept>>");
		String dept = sc.next();
		System.out.print("position>>");
		String position = sc.next();
		System.out.print("sal>>");
		int sal = sc.nextInt();
		Employee e = new Employee(eno, name, dept, position, sal);
		return e;
	}
	static void list(Employee[] emps, int k) {
		for(int i=0 ; i<k; i++) {
			emps[i].display();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[10];	
		
		boolean flag = false;
		int k=0;
		while(true) {
			System.out.println("1.추가, 2.목록보기, 3.종료");
			int num = sc.nextInt();
			switch(num) {
				case 1:employees[k++]=add(); break;
				case 2:list(employees, k); break;
				case 3:flag=true; break;
				default : 
					System.out.println("입력오류");
			}
			if(flag || k==10) break;
			
		}
		System.out.println("end!!");
	}
  
}
