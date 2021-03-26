package javaStandard;

public class ByteOverflow {

	
	public static void main(String[] args) {
		
		byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화
		int i = 0;
		
		//반목문을 이용해서 b의 값을 1 씩, 0부터 270까지 증가 시킨다.
		for(int x = 0 ; x <=270 ; x++) {
			System.out.println(b++); //는 출력 후 줄 바꿈을 하지 않는다.
			System.out.println('\t'); //tab을 출력한다.
			System.out.println(i++);
		}
	}
}
