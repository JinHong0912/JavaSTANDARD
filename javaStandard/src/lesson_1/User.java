package lesson_1;

public class User {
	
	public static void main(String[] args) {
		
		
		Printer pt_1 = new Printer();
	
		pt_1.powerOn();
	
		
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력 하자");
		pt_1.print("ddddd");
		
		System.out.println("1번 마적아");
		
		Printer pt_2 = new Printer();
	
		pt_2.powerOn();
		pt_2.print("vndasdsa");
		

	
	}
}
