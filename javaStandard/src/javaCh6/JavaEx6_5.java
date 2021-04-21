package javaCh6;

class Data1{
	int x;}

public class JavaEx6_5 {

	public static void main(String[] arg) {
		// 기본형 매개변수
		// 참조형 매개변수
		
		Data1 d = new Data1();// 인스턴스 생성
		
		d.x = 10;
		System.out.println(d.x);
		
		// x 의 값을 변경
		change(d.x);
		System.out.println(d.x);
		
		
	}
	
	static void change(int x) {// 기본 매개변수
		x = 1000;
		System.out.println(x);
		
	}
}