package javaStandard;

public class OperatorEx7 {

	public static void main(String[] args) {
	// 논리 부정 연산자 - !
	// boolean형에만 사용 가능
	// true -> false 
	// false -> true 변경
	// 토글 버튼 을 논리적으로 구현 가능
		
	boolean power = false;
	System.out.println(power); // 꺼짐 
	
	power = !power;   // false  값을 true
	System.out.println(power); // 켜짐
	
	power = !power;   // true  값을 false
	System.out.println(power); // 꺼짐
	
	
	
	
	}
}
