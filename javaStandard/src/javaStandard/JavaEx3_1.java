package javaStandard;

public class JavaEx3_1 {

	public static void main(String[] args) {
		//연산자
		//대입 연산자는 연산의 진행 방향이 오른쪽에서 왼쪽으로 한다
		//x=y=3
		//산술>비교>논리>대입 : 대입이 제일 마지막에 수행된다
		//단항 1 > 이항 2 > 삼함 3 단항 연산자의 우선 순위가 이항 연산자보다 높다
		//단항 연산자와 대입 연산자를 제외한 모든 연산자의 진행 방향은 왼쪽에서 오른쪽이다
		
		//단항 연산자 : 증감 연산자 ++ -- 
		// ++ 증가 연산자 : 피연산자의 값을 1 증가
		// -- 감소 연산자 : 피연산자의 값을 1 감소
		
		//[예제 3-1]OperatorEx1.java
		int i = 5;
		i++; // i=i+1 과 같은 의미 ++i 로 바꿔 써도 결과는 같다
		System.out.println(i);
		
		i=5;// 결과를 비교하기 위해 i 값을 다시 5로 변경
		++i;
		System.out.println(i);
		
		
		
	}
}
