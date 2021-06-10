package lesson_1;

public class User{
		public static void main(String[] args) {
		
		Printer pt_1 = new Printer(); // Printer 인스턴스 생성
		
		pt_1.powerOn();
		pt_1.checkPower();
		
		pt_1.print("출력테스트1"); // 사용자가 Printer test 하려고한다.
		pt_1.print("출력테스트2"); // 사용자가 Printer test 하려고한다.
		pt_1.print("출력테스트3"); // 사용자가 Printer test 하려고한다.
	
		
		
		
		
		}
	
}