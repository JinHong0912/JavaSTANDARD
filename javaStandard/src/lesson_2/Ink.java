package lesson_2;

public class Ink {

	
	private int inkCount;
	
	public Ink() {
		inkCount = 3;
		System.out.println(inkCount + "현재 잉크 개수는?");
	}
	
	public boolean useInk() {
		boolean existInk;
		
		if(inkCount > 0) {
			inkCount--;
			existInk = true;
			System.out.println(inkCount+"현재 잉크의 개수는?");
		}else {
			System.out.println("잉크가 모자랍니다.");
			existInk = false;
		}
		System.out.println("남은 잉크 수량 : " + inkCount);
		return existInk;
	}

	
	public void chargeInk(int count) {
		 inkCount = count + 1;
		 System.out.println("남은 잉크 수량 : "+inkCount);
	}















}