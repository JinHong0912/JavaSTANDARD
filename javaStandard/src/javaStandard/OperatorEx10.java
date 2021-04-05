package javaStandard;

public class OperatorEx10 {

	public static void main(String[] args) {
	// 피연산자 계산 하기
	// 연산자의 연산의 값을 int형 보다 크기가 작으면 전부 int 형으로 변환 한다음에 연산을 수행 한다
	
//	byte a = 10;
//	byte b = 30;
	//byte c = a + b;// 연산자 + 는 두개의 피연산자들의 자료형을 int형으로 변환한 다음 덧셈 연산을 수행
				   // byte 으로 선언된 c 에ㅔ 연산값을 넣을려면 byte가 int 보다 작기 때문에
				   // 형변환이 필요하다 byte c = (byte) (a+b);
	
//	byte c = (byte)(a * b);
//	System.out.println(c);
//	
	
	// [예제 3-11] OperatorEx11
	long a = 1000000 * 1000000;
	long b = 1000000 * 1000000L; //long형 리터럴 int * long = long
	
	System.out.println(a);
	System.out.println(b);
	
	
	
	}
}
