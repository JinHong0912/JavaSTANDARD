package javaCh6;

import java.io.FileWriter;
import java.io.IOException;

public class OtherssOOP {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);//PI와 같은 변수
		System.out.println(Math.floor(1.8)); // 내림 매서도 있다
		System.out.println(Math.ceil(1.8)); // 올림
		
		FileWriter f1 = new FileWriter("data.txt"); // 파일 생성 
		f1.write("Hello");
		f1.write("Java");
		f1.close();
	}

}
