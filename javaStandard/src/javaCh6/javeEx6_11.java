package javaCh6;


public class javeEx6_11 {
	
	public static void main(String[] args) {
		// 자바늬 정석 2판 
		// 6 : 객체 지향
		//예제6_11
		// 기본형 매개변수와 참조형 매개변수
		
		int[] x = {10}; // 크기가 1인 배열. x[0]=10;
		
		 System.out.println("main() : x ="+ x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main () : x =" + x[0]);
		
	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("changs() : x = " + x[0]);
	}



}
