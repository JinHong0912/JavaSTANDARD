package lesson_1Compare_1;

public class Printer_2 {

	//프린트의 전원을 2가지이다 끄고 켜고
	private boolean power;
	// true ,false 로 한다.
	
	Printer_2(){// 이 생성자가 실행 되면 Printer의 상태는 꺼짐
		power = false;
	}
	
	public boolean checkPower_2() {// Printer의 상태 확인
		if(power == true) {// Printer 켜진 상태일시 if 문 출력
			System.out.println("전원상태 : ON");
		}else { //Printer 상태가 꺼진 상태 일시에 else 출
			System.out.println("전원상태 : OFF");
		}
		
		return this.power;
	}
	
	public void powerOn() {
		power = true;
	}// 컴
	
	public void powerOff() {
		power = false;
	}// 끔
	
	public void print(String str) {// User의 입력 값을 매개 변수로 받음
		
		if (power == false) { // 만약에 Printer 상태가 꺼져 있으면 false라서 전원을 켜주세요 출력
			System.out.println("전원을 켜주세요.");
			return; 
		}else {// 만약에 Printer 상태가 true 일떄 else 출력
			Ink ink = new Ink();
			ink.useInk();
			System.out.println("출력 시작");
			System.out.println("<<"+str+">>");
			System.out.println("출력 완료");
		}
		
	}
	
	
	
}
