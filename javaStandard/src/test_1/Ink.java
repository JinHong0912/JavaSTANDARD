package test_1;

public class Ink {

	//잉크가 몇 개 있는지 알고 싶다. 잉크의 초기 값은 3이다
	private int inkCount;
	
	public Ink() { //생성자
		inkCount = 3;//초기 값은 3
		System.out.println("Printer의 잉크 초기값은 : "+inkCount);
	}
	
	
	//잉크 있는지 없는지
	public boolean inkCheck() {
		
		// 잉크가 있으면 true 
		if(inkCount > 0) {
			return true;
		}
		//없으면 잉크가 없습니다 출력.
		
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
