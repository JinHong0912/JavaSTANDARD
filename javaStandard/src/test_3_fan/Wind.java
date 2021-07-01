package test_3_fan;

public class Wind extends Fan { // Fan 상속 받아서 사용해 보기
	
	

	//선풍기에 음성 인식이 되는 기능
	private String wind;
	
	Fan fan;
	public Wind() {
		 fan = new Fan();
		wind = "정지";
		System.out.println("이 선풍기는 음성인식이 가능 합니다. 처음 상태는? : "+wind+"입니다");
	}
	

	public String talkWind(String str) {
		
		if(str == "미풍") {
			
			fan.windChoice(1);
		
		}else if(str == "약풍"){
			fan.windChoice(2);
			
		}else if(str == "강풍") {
			
			fan.windChoice(3);
		}else {
			System.out.println("발음을 정확히 말씀해 주세요.");
		}
		
		return str;
	}

	
}



