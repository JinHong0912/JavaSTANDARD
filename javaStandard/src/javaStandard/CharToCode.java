package javaStandard;

public class CharToCode {

	
		public static void main(String[] args) {
			//[예제2-1]
//			char ch = 'A';  //char ch = '\u0041';로 바꿔 써도 가능
//			int code = (int)ch; //ch에 저장 된 값을 int형으로 변환하여 저장한다.
//			
//			System.out.println(ch);
//			System.out.println(code);
//			
			
			//[예제2-2]
			int code = 65; // 또는 int code = 0x0041;
			char ch = (char)code;
			
			
			System.out.println(code);
			System.out.println(ch);
		}
}

