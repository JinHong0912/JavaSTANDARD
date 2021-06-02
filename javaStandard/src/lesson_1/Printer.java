package lesson_1;

public class Printer {
	
	
	
	//1. 프린트 기능 power 기능
	private boolean power;// 파워 속상
	
	//2. 인크 객체 있음
	Ink ink; // 변수 선언
	
	// Printer 	기능 만들기
	Printer(){
		power = false;
		ink = new Ink(); //?
		
	}
	
	public boolean checkPower() {
		if(power == true) {
			System.out.println("전원상태 : ON");
		}else {
			System.out.println("전원상태 : OFF");
		}
		return this.power;
	}
	
	// power On 기능
	public void powerOn() {
		power = true;
	}
	// power Off 기능
	public void powerOff() {
		power = false;
		
	}

	public void print(String str) {
		if (power == false) {
			System.out.println("전원을 켜주세요.");
			
			return;
			
		}
		
		ink.useInk();
		System.out.println("출력 시작");
		System.out.println("<<"+str+">>");
		System.out.println("출력 끝");
		
	}



}//End