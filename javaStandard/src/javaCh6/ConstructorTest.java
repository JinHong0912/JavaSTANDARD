package javaCh6;

public class ConstructorTest {
	
//	private int x1 = 0;
//	private int y1 = 0;
	
	 int x1 = 0;
	 int y1 = 0; // 초기값
	
	
	public ConstructorTest(int x1, int y1) {
		this.x1= x1;
		this.y1= y1;
		
	}
	public static void main(String[] arg) {
			
		ConstructorTest ct = new ConstructorTest(10,20); // 생성자 실행
		
		System.out.println(ct.x1);
		System.out.println(ct.y1);
		
		
		
	}
	
}
