package javaTast;
	
	public class JavaTest2 {
		
		int a;
		//static int a; // static을 하면 메모리에 올라간다. 메모리 낭비가 일어난다
		
	public static void main(String[] args) {
		
		JavaTest2 jt = new JavaTest2();
		
		int b = 10;
		// 변수 a에 b값을 넣고 콘솔에 출력해 보시오.
		jt.a = b;
		System.out.println(jt.a);
		
//		JavaTest2 t2 = new JavaTest2();
//		
//		t2.a = b;
		
	}


	
}
