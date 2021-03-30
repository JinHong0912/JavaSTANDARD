package javaStandard;

public class JavaEx3_4 {

	public static void main(String[] args) {
		//부호 연산자
		//[예제 3-4 ]OperatorEx4.java
		// 부호 연산자 + 의 경우는 피연산자에 양수 1을 곱합 결과
		// 부호 연산자 - 의 경우는 피연산자에 음수 1을 곱합 결과
		
		int i = -10;
		i = +i;
		System.out.println(i);
		i = -10;
		i = -i;
		System.out.println(i);

		// 비트 연산자 : ~
		// 정수형과 char 형만 사용 가능
		// 피연산자를 2진수로 표현 하고 0을 1로 1을 0으로 바꾼다.
		// 비트 전환이 일어나면 피연산자의 부호가 반대로 변경
		// 10의 2 진수 1010
		// 비트 전환 1111 0101 -11
		
		//[예제 3-5 ]OperatorEx5.java
//		 byte b =10;
//		 System.out.println("b = "+b);
//		 System.out.println("~b="+ ~b);
//		 System.out.println("~b+1="+(~b+1));

		
		 //[예제 3-6 ]OperatorEx6.java
		 byte b = 10;
		 //byte result = ~b; // ~ 연산자의 결과가 int라서 byte형 변수에 저장 할 수 없다
		 byte result = (byte)~b;
		 
		 System.out.println("b= "+ b);
		 System.out.println("~b= "+result);
	
	
	
	
	
	
	
	
	
	
	}
}
