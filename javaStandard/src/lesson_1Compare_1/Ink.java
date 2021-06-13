package lesson_1Compare_1;

public class Ink {
	
	private int inkCount;
	
	public Ink() {
		inkCount = 3;
		System.out.println(inkCount);
	}

	
	public void useInk() {
		//System.out.println("남은 잉크 수정 : " + --inkCount);
		
		System.out.println("남은 잉크 수정 : " + inkCount--);
		
	}

	public void changInk() {
		if(inkCount > 0) {
			System.out.println("잉크가 없습니다.");
		}
		return;
	}
}
