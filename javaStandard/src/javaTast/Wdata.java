package javaTast;

class Weater{
	
	int month;
	int day;
	String sky;
	
}



public class Wdata {

	
	public static void main(String[] args) {
		
		Weater day = new Weater();// 인스턴스 생성
		
		day.month = 10;
		day.day=5;
		day.sky="오늘 날씨는 비가 옵니다";
		
		System.out.println(day.month);
		System.out.println(day.day);
		System.out.println(day.sky);
		
		
	}
}
