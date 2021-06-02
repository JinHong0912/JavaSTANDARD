package lesson_1;

public class User {

	public static void main(String[] args) {
		
		Printer pt_1 = new Printer();
		
		pt_1.checkPower();
		pt_1.print("출력 텍스트");
		pt_1.powerOn();
		
	}
}
