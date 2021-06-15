package test_2_Printer;

public class Printer {
	
	//Ink 초기값은 한번만 실행
	Ink ink;
	
	public Printer() {
		ink = new Ink();
		
	}
	
	
	
	// user이 호출 프린트 호출
	public String print(String text) {
		
		//잉크 초기값 테스트
		//Ink ink = new Ink();
		
		
		// 용지 테스트
		
		//text 테스트 하기
		//System.out.println(text); // 완료 
		
		
		//Printer 기능 만들기
		//1. 용지가 있으면 출력
		//2. 없으면 용지 없습니다.
		
		//if 사용 하기
		if(ink.paperCheck()) {
			
			System.out.println("출력 시작");
			System.out.println("<<"+text+">>");
			System.out.println("출력 끝");
			//ink.changePaper();
			ink.changeInk();
			
			
		}else {
			//text = "잉크를 체워 주세요"; // 
			System.out.println("용지가 없습니다.");
		}
		
		
		//System.out.println(paper); //용지 테스트
		
		//잉크 갯수 테스트 
		//ink.changeInk();
		
		return text;
		
	}

}
