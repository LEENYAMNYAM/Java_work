package collectionPro;

public class GStack<T> {
//	 필드
	int tos;
	Object[] stack;
	
//	생성자
	public GStack() {
		tos = 0;
		stack = new Object[10];
	}
	
//	메소드
	public void push(T item) {
		if(tos == 10)
			return;
		stack[tos++] = item;
	}
	
	public T pop() {
		if(tos-- == 0)
			return null;
		return (T)stack[tos];  //타입을 T형으로 타입캐스팅해서 return 함.
	}
	
	
	
}
