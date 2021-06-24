package test_4_Printer;

public class Printer {

	
	private boolean power;
	
	Ink ink;
	
	public Printer() {
		//처음에 전원 값은 false
		power = false;
		System.out.println("전원 꺼짐 "+power);
		ink = new Ink();
			
	}
	
	public String print(String str) {
		
		
		// 출력 할 때 << 같이 나오기
		//조건을 주기 잉크가 있으면 출력 없으면 용기 없음
		if(ink.inkCheck()) {
			str = "<<"+str+">>";
			ink.changeInk();
			
		}else{
			
			str = "잉크 없습니다.";
		}
		
		return str;
		
		
	}
	
}
