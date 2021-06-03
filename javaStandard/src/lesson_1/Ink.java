package lesson_1;

public class Ink {
	

	// 잉크 라는 기능을 만든다.
	
	private int inkCount;
	
	public Ink() {
		inkCount = 5;
		
	}// 카운트가 5번 이다.
	
	public void useInk() {
		System.out.println("남은 잉크 수량 : "+ --inkCount);
	}
}
