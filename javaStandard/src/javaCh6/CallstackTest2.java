package javaCh6;

public class CallstackTest2 {

	
	public static void main(String[] args) {
		System.out.println("main (String[] args) 이 시작되었음");
		firstMethod();
		System.out.println("main (String[] args) 이 끝임");
	}
	
	
	static void firstMethod() {
		System.out.println("firstMethod 이 시작되었음");
		secondMethod();
		System.out.println("firstMethod이 끝임");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod 이 시작");
		System.out.println("secondMethod()");
		System.out.println("secondMethod 이 끝남");
	}
}
