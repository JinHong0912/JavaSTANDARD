package javaTast;
	
public class JavaTest4{
	
	public static void main(String[] args) {
		
		
		int a = 300;
		// 문제 1 : 변수값 a를 아래 메서드에 파라미터로 전달하고 메서드에서 콘솔에 출력하는 코드를 개발 후 실행해보시오.
		// 문제 2 : 받은 파라미터를 곱하기3해서 다시 main으로 보내고 main에서 해당 값을 출력해 보시오.
		printNumber(a);
		int b = printNumber(a);
		System.out.println(b);
		
		System.out.printf("%d \n",123);
		
	}
	static public int printNumber(int a) {
		System.out.println(a);
		
		int b = a*3;
		
		return b;
	
	}

	


}