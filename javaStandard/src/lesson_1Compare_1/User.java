package lesson_1Compare_1;

public class User {
	
	public static void main(String[] args) {
		
		Printer_1 pt_1 = new Printer_1();
		System.out.println("시작 ");
		pt_1.powerOn();
		pt_1.checkPower_1();
		pt_1.print("출력테스트1");
		pt_1.print("출력테스트2");
		pt_1.print("출력테스트3");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		
		System.out.println("---------------------------");

		Printer_2 pt_2 = new Printer_2();
	
	//	pt_2.powerOff();
//		pt_2.powerOn();
//		pt_2.checkPower_2();
//		pt_2.print("출력테스트1");
//		pt_2.print("출력테스트2");
//		pt_2.print("출력테스트3");
//		pt_2.print("출력테스트4");
//		pt_2.print("출력테스트5");
//	
	
	}

}
