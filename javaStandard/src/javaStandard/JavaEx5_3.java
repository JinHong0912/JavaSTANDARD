package javaStandard;

import java.io.IOException;

public class JavaEx5_3 {

		// 	클래스 만들기
		public int age;
		public float height;
		public float weight;
	
	
	public static void main(String[] args) throws IOException {

		JavaEx5_3 java = new JavaEx5_3();
		
		java.age =10;
		java.height=1.11f;
		java.weight=10.11f;
		
		
		System.out.println(java.age);
		System.out.println(java.height);
		System.out.println(java.weight);
		
		
		
	} 
}
