package javaStandard;

class Data{
	int x;
}

public class javeEx6_10 {
	
	public static void main(String[] args) {
		// 자바늬 정석 2판 
		// 6 : 객체 지향
		//예제6_10
		// 기본형 매개변수와 참조형 매개변수
		
		Data ex1 = new Data(); // 인스턴스 선언
		
		ex1.x = 10;
		
		System.out.println("main () : x =" + ex1.x );
		
		
		change(ex1.x);
		System.out.println("After change(ex1)");
		System.out.println("main () : x =" + ex1.x );
		
	}

	static void change(int x) {
		x =1000;
		System.out.println("changs() : x = " + x);
	}



}
