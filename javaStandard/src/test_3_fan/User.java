package test_3_fan;

public class User {

	public static void main(String[] args) {
		//
		//System.out.println("선풍기 만들기");
		Fan fan  = new Fan();
		Wind wind = new Wind();
		//Wind win = new Wind();
		
		
	
		//get 테스트
//		fan.getFanOff();
		fan.getFanOn();
		fan.fanCheck();
		
		//fan.windChoice(0);
		
		fan.windChoice(1);
		//fan.windChoice(2);
		//fan.windChoice(3);
		//wind.talkWind("강풍");
	
	//선풍기에서 바람을 선풍기가 관리 하게 만들어 보기
		//fan.wind("미풍");
	
	
	}
}
