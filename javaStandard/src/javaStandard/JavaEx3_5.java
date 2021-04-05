package javaStandard;

public class JavaEx3_5 {

	public static void main(String[] args) {
		//산술연산자
		// 이항 연산자는 피 연산자의 크기가 4byte 보다 작으면 4byte(int)형로 변환한 다음에 연산을 수행한다는 점
		// 연산을 수행하기 전에 피연산자들의 타입을 일치 시킨다는 사실 또한 매우 중요
		// 크기가 4 byte 이하인 자료형을 int형으로 변환한다.(byte1, char2,short2 -> int 4)
		// 피연산자들의 타입을 서로 일치 시킨다.
		
		// 사칙 연산자 +,-,*, /
		// 나머지 연산자(%)
		// 쉬프트 연산자(<<,>>,>>>)
		// * / % + - 우선 순위
		// 1. int 형( 4byte) 보다 크기가 작은 자료형은 int형으로 형 변환 후에 연산을 수행한다
		// byte + short => int + int -> int
		// 2. 두 개의 피 연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 형 변환 된 후 연산을 수행한다.
		// int 4 + float4(실수이기 때문에 정수인 int 보다 크다) -> float + float -> float
		// 3. 정수형 간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.
		
		
	
	
	
	
	
	}
}
