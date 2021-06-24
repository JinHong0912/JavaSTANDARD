package test_1;

public class Printer {
	
	private boolean power;
	
	Ink ink; 
	
	
	public Printer() {
		power = false;
		ink = new Ink();
	}

	// User String 받아 오기
	public String print(String str) {
		//checkInk 테스트
		
		
		//InkCount 테스트
		if(ink.inkCheck()) {
			
			str = "<<"+str+">>";
			ink.changeInk();
			
		}else{
			
			str ="잉크가 없습니다.";
		}
		
		return str;
		
	}
}
