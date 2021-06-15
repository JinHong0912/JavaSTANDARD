package test_2_Printer;

public class Ink {
	
	//용지 있는지 확인
	
	private int paperCount;
	private int inkCount;	
	// 처음 용지와 잉크 초기값 : 생성자생성
	public Ink() {
		paperCount = 3;
		inkCount = 3;
		//초기 값 테스트 
		System.out.println("기본 용지는 : "+paperCount+"\n"+"기본 잉크는 : "+inkCount);
	}
	
	
	
	public boolean paperCheck() {
		
		//용지 테스트 완료
		if(paperCount > 0) {
		
			return true;
		}
		
		return false;
	}
	//용지 출력
//	public void changePaper() {
//		if(paperCount> 0) {
//			System.out.println("남은 용지는 : "+ --paperCount);
//		}else {
//			System.out.println("용지가 없습니다.");
//		}
//	}
	
	// 잉크 출력
	public void changeInk() {
		
		//잉크가 있으면
		if(paperCount > 0 && inkCount > 0) {
			System.out.println("남은 용지는 : "+ --paperCount);
			System.out.println("남은 잉크는 : "+ --inkCount);
			
		}else {
			System.out.println("잉크가 없습니다. 충전해 주세요");
		}
	}
}
