package javaStandard;

public class JavaEx3_2 {

	public static void main(String[] args) {
		//연산자 후위 전위 연산자
		//[예제 3-2 ]OperatorEx2.java
		int i =5;
		int j =0;
		j = i++;
		System.out.println("j=i++; 실행 후 , i="+ i+", j="+j);

		i =5;
		j=0;
		j= ++i;
		System.out.println("j=++i; 실행 후 , i="+ i+", j="+j);
		
		
		//수식을 계산 하기 위해서는 수식에 포함된 변수의 값을 읽어와야 하는데
		//전위형++i은 변수(피연산자)의 값을 먼저 증가시킨 후에 변수의 값을 읽어 온다
		//후위형 i++ 은 변수의 값을 먼저 읽어 온 후에 값을 증가 시킨다.
		
		
	}
}
