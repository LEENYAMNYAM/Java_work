package streamPro;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\JMT\\JAVA\\workspace\\test4.out"); 
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
		
	}

}
