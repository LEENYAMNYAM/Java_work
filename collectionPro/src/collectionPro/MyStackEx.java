package collectionPro;

public class MyStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int i=0; i<3; i++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int i=0; i<3; i++) {
			System.out.println(intStack.pop());
		}
		
	}

}
