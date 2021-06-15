package test_2_Printer;

public class User {
	
	//main 만들기
	public static void main(String[] args) {
	// 	시작 테스트
		System.out.println("시작 테스트");
	
	//프린트 class 사용
		Printer pt = new Printer();
		
		
		//pt.print("프린트 출력 테스트1"); //완료
		
		//용지 테스트
		//pt.print("용지 테스트1");

		//if 테스트
		//1번 출력
		pt.print("if 테스트1");
		pt.print("if 테스트2");
		pt.print("if 테스트3");
		pt.print("if 테스트4");
		pt.print("if 테스트5");
//		
//		2번 출력
//		System.out.println(pt.print("sysout1"));
//		System.out.println(pt.print("sysout2"));
//		System.out.println(pt.print("sysout3"));
//		System.out.println(pt.print("sysout4"));
//		System.out.println(pt.print("sysout5"));
	
	
	}

}
