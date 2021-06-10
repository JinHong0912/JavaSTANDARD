package lesson_1Compare_1;

public class Ink {
	
	private int inkCount;
	
	public Ink() {
		inkCount = 3;
	}

	
	public void useInk() {
		System.out.println("남은 잉크 수정 : " + --inkCount);
	}
}
