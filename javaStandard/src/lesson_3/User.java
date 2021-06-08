package lesson_3;

public class User {

	
	public static void main(String[] args) {
		
		Printer pt = new Printer(true);
		pt.checkPower();
		
		pt.print("출력1");
		pt.print("출력2");		
		pt.print("출력3");		
		pt.print("출력4");		

		//Printer와 Ink 클래스를 분석 해서 네번째
		// 출력도 출력 시켜 보세요.
		
	}
}
