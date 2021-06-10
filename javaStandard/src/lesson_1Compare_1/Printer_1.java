package lesson_1Compare_1;

public class Printer_1 {

	
	private boolean power;
	Ink ink;
	
	Printer_1(){ // 생성자가 실행 되자 마자  초기화 한다.
		power = false;
		ink = new Ink(); // Ink 초기화
	}
	
	public boolean checkPower_1() {
		if(power = true) {
			System.out.println("전원상태 : ON");
		}else {
			System.out.println("전원상태 : OFF");
		}
		return this.power;
	}
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	
	public void print(String str) {
		
		if(power == false) {
			  System.out.println("전원을 켜주세요.");
			  return;
		}
			ink.useInk();
			System.out.println("출력 시작 ");
			System.out.println("<<"+str+">>");
			System.out.println("출력 끝");
	}
	
	
}
