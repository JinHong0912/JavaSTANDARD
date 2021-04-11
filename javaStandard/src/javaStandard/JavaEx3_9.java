package javaStandard;

import java.io.IOException;

public class JavaEx3_9 {

	public static void main(String[] args) throws IOException {

		//배열
		//배열 정렬 하기 
		int[] number = new int[10];
		
		for(int i = 0; i <number.length; i++ ) {
			number[i] = i; // 배열을 0~ 9 의 숫자로 초기화 한다,
			
			System.out.print(number[i]);
		}
		System.out.println();
		
		for(int i =0; i < 100; i++) {
			int n = (int)(Math.random() * 10 ); // 0부 터 9까지의 의 값을 얻는다.
			int temp = number[0];//1
			number[0] = number[n];
			number[n] = temp;  //number[0]과 number[n] 의 값을 서로 바꾼다.temp에 하나의 값을 넣는다.
			
		}
		
		for(int i = 0; i < number.length ; i++) {
			System.out.print(number[i]); // 배열의 내용을 출력 한다
		}
		
		
		
	} 
}
