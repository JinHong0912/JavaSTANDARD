package javaCh6;


class Tv2{
	// Tv의 속성 (멤버 변수)
	
	String color; // 색상
	boolean power;// 전원상태 ( on /ffo )
	int channel;  // 채널

	// Tv의 기능 ( 메서드 )
	void power() { power = !power; } // TV를 켜거나 끄는 기능 하는 메소드
	void channelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메소드
	void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메소드
	
}

public class JavaEx6_2 {
	
	public static void main(String[] arg) {
		
		// 자바의 정석 6장 객체 지향 개념 잡기
		// 클래스와 객체
		// 객체의 구성요소 -> 속성(멤버 변수) + 기능 ( 메소드)
		// 클래스(설계도) 객체(제품)
		// 클래스를 인스턴스화 하면 객체가 만들어진다 == 설계도로 제품을 생산 하면 설계도에 따라 제품생산이 된다.
		// 인스턴스는 객체와 같은 의미이고 객체는 모든 인스턴스를 대표 하는 의미 이다
		
		// 예제 ch6/TvTest.java
		// 인스턴스 선언

//		Tv t; // Tv 인스턴스를 참조 하기 위한 변수 t를 선언
//		t = new Tv(); // Tv 인스턴스를 생성 한다.

		Tv2 t1 = new Tv2(); // 클래스명 변수명 = new 클래스명
		Tv2 t2 = new Tv2(); // 클래스명 변수명 = new 클래스명
		
		Tv2 t3 = new Tv2(); // 클래스명 변수명 = new 클래스명
		Tv2 t4 = new Tv2(); // 클래스명 변수명 = new 클래스명
		
		System.out.println("t1 채널 값은 " + t1.channel + "입니다");
		System.out.println("t2 채널 값은 " + t2.channel + "입니다");
						
		System.out.println("t3 채널 값은 " + t3.channel + "입니다");
		System.out.println("t4 채널 값은 " + t4.channel + "입니다");
		
		t1.channel = 7; // Tv 인스턴스의 멤버 변수 channel 의 값을 7로 한다.
		System.out.println("t1 채널을 7로 변경 합니다.");
		t3.channel = 10; // Tv 인스턴스의 멤버 변수 channel 의 값을 7로 한다.
		System.out.println("t3 채널을 10로 변경 합니다.");
		
		System.out.println("t1 채널 값은 " + t1.channel + "입니다");
		System.out.println("t2 채널 값은 " + t2.channel + "입니다");
		System.out.println("t3 채널 값은 " + t3.channel + "입니다");
		System.out.println("t4 채널 값은 " + t4.channel + "입니다");
		
		
		
		
	} 
}
