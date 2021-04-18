package javaCh6;

public class JavaEx6_6 {
	
	
	public static void main(String[] arg) {
		
	//메서드 선언
	MyMath mm = new MyMath();// 인스턴스 선언
	
	long result1 = mm.add(5L,3L);
	long result2 = mm.subtract(5L,3L);
	long result3 = mm.multiply(5L,3L);
	double result4 = mm.divide(5L,3L); // 더 정확한 값을 위해서 나누기
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	}
	
}

// 클래스 선언
class MyMath{
	long add (long a, long b) {
		long result = a+b;
		
		return result;
		
		//return a+b; 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long subtract(long a ,long b) {
		
		return a - b;
	}
	long multiply(long a ,long b) {
		
		return a * b;
	}
	double divide(double a ,double b) {
		
		return a / b;
	}

}