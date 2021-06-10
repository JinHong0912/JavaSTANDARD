package lesson_2;

public class User {
	
	public static void main(String[] args) {
		
		// 전부 프린터를 사용해서 출력해 보세요
		
		Printer pt_1 = new Printer();
		
		pt_1.powerOn();
		pt_1.print("출력테스트1");
		pt_1.print("출력테스트2");
		pt_1.print("출력테스트3");
		pt_1.print("출력테스트4");
		pt_1.chargeInk(10);
		pt_1.print("충전 후 출력1");
		pt_1.print("충전 후 출력2");
		pt_1.print("충전 후 출력3");
		pt_1.print("충전 후 출력4");
		pt_1.print("충전 후 출력5");
		pt_1.print("충전 후 출력6");
		pt_1.print("충전 후 출력7");
	
	
	
	}

}