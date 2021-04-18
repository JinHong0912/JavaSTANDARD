package javaCh6;

public class JavaEx6_5 {
	
	
	public static void main(String[] arg) {
		
	//메서드 선언
	JavaEx6_5 r = new JavaEx6_5(); // 인스턴스 선언
	 
	int result = r.add(3, 5);
	System.out.println(result);
		 
	
	int[] result2 = {0}; // 배열을 생성하고 result[0] 의 값을  0으로 초기화
	r.add(3, 5, result2); // 배열을 add 메서드의 매개변수로 전달
	System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result2) {
		
		result2[0] = a+b;
	}
}
