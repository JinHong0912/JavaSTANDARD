package test_4_Printer;

public class Ink {
	
	//잉크가 몇개 인지 알고 싶다
	private int inkCount;
	
	// 잉크 초기값은 3
	
	//생성자 만들기
	public Ink() {
		inkCount = 3;
		System.out.println("잉크 초기 값은 " + inkCount);
	}
	
	public boolean inkCheck() {
		if(inkCount > 0) {
			// 잉크가 있으면 true 
			return true;
		}
		// 없으면 false
		return false;
	}

	
	// 잉크가 없으면 충전 해주세요 라고 하기
		public void changeInk() {
			
			// 잉크 있으면 있다.
			if(inkCount > 0) {
				System.out.println("남은 잉크는 ? : " + --inkCount);
			}else {
				
				//없으면 충전해 주세요.
				System.out.println("잉크 충전해주세요");
			}
			
		}
}
