package streamPro;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("d:/JMT/JAVA/workspace/test4.out");  
			//자바는 역슬러쉬 말고 그냥 슬러쉬도 알아먹음
			
			int n=0;
			int c;
//			while((c=(int)fin.read()) != -1) {
//				b[n] = (byte)c;
//				n++;
//			}

			// 만약
			while((c=fin.read()) != -1) {
				System.out.print((byte)c+" ");
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("test4.out 에서 읽은 배열을 출력");
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
		}catch(IOException e) {
			System.out.println("파일 입력 오류");
		}
		
	}

}
