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
			int code = 66; // 또는 int code = 0x0041;
			char ch = (char)code;
			char tab = '\t';
			
			
			
			System.out.println(code);
			System.out.println(ch); 
			System.out.println(tab); 
		//tab = \t
		System.out.println("안녕하세요"+"감사합니다");
		System.out.println("안녕하세요\t"+"감사합니다");
		//backspace = \b
		System.out.println("안녕하세요\b"+"감사합니다");
		System.out.println("안녕하세요\t"+"감사합니다");
		//form feed = \f
		System.out.println("안녕하세요\f"+"감사합니다");
		System.out.println("안녕하세요\t"+"감사합니다");
		//new line = \n
		System.out.println("안녕하세요\n"+"감사합니다");
		System.out.println("안녕하세요\t"+"감사합니다");
		//carriage return = \r
		System.out.println("안녕하세요\t"+"감사합니다");
		System.out.println("안녕하세요\r"+"감사합니다");
		
		}
		
		
}

