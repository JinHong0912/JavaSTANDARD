package javaStandard;

import java.io.IOException;

public class JavaEx5_2 {

	public static void main(String[] args) throws IOException {

	int input = 0;
	
	System.out.println("문장을 입력하세요");
	System.out.println("입을 마치면 x을 입력하세요");
	
	
	do {
		input = System.in.read();
		System.out.println((char)input);
	}while(input != -1 && input !='x');		
		
	} 
}
