package test_1;

public class Printer {
	
	Ink ink;
	
	public Printer() {
		ink = new Ink();
	}
	public String print(String str) {
		
	
		
		
		if(ink.checkInk()) {
		
			str = "<<"+str+">>";
			ink.changInk();
		
		}else {

			str = "용지가 없습니다."; 
	
		}
		
		return str;
	}

}
