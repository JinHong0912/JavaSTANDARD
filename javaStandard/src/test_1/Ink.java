package test_1;

public class Ink {

	
	// 처음 잉크 

	private int inkCount;
	
	public Ink() {
		inkCount = 3;
		//System.out.println(inkCount);
	}
	
	public boolean checkInk() {
		if(inkCount>0) {
			
			return true;
		}
		
		return false;
	}
	
	public void changInk() {
		
		if(inkCount > 0) {
			
			System.out.println(inkCount--);
		}else {
			
			System.out.println("잉크 없음");
		}
	}
	
}
