package test_3_fan;

public class Fan {
	
	//선풍기 On,Off
	//처음에는 선풍기 꺼짐
	private boolean power;
	
	private int windNum;
	
	public Fan() {
		
		power = false;
		windNum = 0;
		//System.out.println("콘센트를 연결해주세요 : " + power);
		//System.out.println("바람을 선택해주세요 : " + windNum);
	}
	
	//전원이 켜져야 한다.
	//getter 만들기
	public void getFanOn() {
		power = true;
		
		//System.out.println(power);
	}
	
	public void getFanOff() {
		power = false;
		//System.out.println(power);
	}
	
	//전원을 check 하는 부분 만들기
	public boolean fanCheck() {
		
		if(power == true) {
			System.out.println("바람의 세기를 선택하세요 : 1, 2, 3");
		}else {
			System.out.println("선풍기의 전원을 켜주세요.");
		}
		
		return power;
	}

	// 바람 세기 테스트
	public int windChoice(int windNum) {
		
		if(windNum == 1) {
			System.out.println("미풍을 선택 하셨습니다.");
		
		}else if(windNum == 2) {
			System.out.println("약풍을 선택 하셨습니다.");
			
		}else if(windNum == 3){
			System.out.println("강풍을 선택 하셨습니다.");
		}else {
			System.out.println("잘 못 선택 하셨습니다.");
		}
		
		return windNum;
	}

	// 선풍기 회전
	



}
