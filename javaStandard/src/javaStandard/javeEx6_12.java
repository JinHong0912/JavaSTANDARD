package javaStandard;


public class javeEx6_12 {
	
	public static void main(String[] args) {
		// 자바늬 정석 2판 
		// 6 : 객체 지향
		// 기본형 매개변수와 참조형 매개변수
		System.out.println(test(4));
		
}
	static long test(int n) {
		long result=0;
		
		if(n==1) {
			result= 1;
			System.out.println("1.값은?"+n);
			
		}else {
			System.out.println("2.값은?"+n);
			
			result = n * test(n-1);
			
			System.out.println("3.값은?"+n);
		}
		System.out.println("4.값은?"+result);

		//System.out.println(result);
		return result;
	}
}