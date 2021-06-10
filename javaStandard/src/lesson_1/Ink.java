package lesson_1;

public class Ink{
	
	private int inkCount;
	
	 Ink() {
		 inkCount = 3;
	}
	 
	 public void useInk() {
		 System.out.println("남은 잉크 수정 : "+ --inkCount);
		 
	 }
	 
	 public void endInk() {
		
		 
		 if(inkCount == 0) {
			 System.out.println("잉크가 없습니다");
		 }
		 
	 }
}