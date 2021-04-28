package javaTast;

public class MethodTest {
	
	 static void disp() {
		 
		 int c;
		 Calc calc = new Calc();
		 c = calc.add(10, 100);
		 System.out.println(c);
	 }
	
	
	
	
	int a (int x , int y) {
		System.out.println("인수는"+x);
	
		return x+y;
	}
	
	
	public static void main(String[] args) {
		
		// 메소드 호출 하기

		MethodTest mt = new MethodTest();
		
		System.out.println(mt.a(3, 5));
		
		disp();
		
		
	}
}

class Calc{
	int add(int a, int b) {
		return a+b;
	
	}
}