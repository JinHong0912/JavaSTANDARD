package javaCh6;

class Foo{
	public static String classVar = "I class var"; // class 소속
	public String instanceVar = "I Instance var"; // instance 소속
	
	public static void classMethod() {
		
		System.out.println(classVar); // 된다. 클래스 변수에는 접근 가능
		//System.out.println(instanceVar); // 안된다. 인스턴스 변수에는 접근 안된다.
		
	}
			
	public void instanceMethod() { // 인스턴스 메소드 안에서는 클래스변수, 인스턴스변수 모두 접근 가능
		System.out.println(classVar); // 된다
		System.out.println(instanceVar); //된다
		// 
		
		
	}
	
}

public class StaticApp {
	

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // 접근이 된다. class 는 접근이 가능
		//System.out.println(Foo.); // 접근 안됨 -> 인스턴스는 인스턴스를 통해서만 사용 가능한 변수다

		Foo.classMethod(); // 접근이 된다
		//Foo.instanceMethod(); // 인스턴스 메소드는 인스턴스 소속임으로 클래스를 통해서 접근이 금지되어 있다
		
//		Foo f1 = new Foo(); // 인스턴스 f1 생성
//		
//		f1.instanceMethod();
		
		 	Foo f1 = new Foo();
	        Foo f2 = new Foo();
//	      
	        System.out.println(f1.classVar); // I class var
	        System.out.println(f1.instanceVar); // I instance var
//	      
	        f1.classVar = "changed by f1";
	        System.out.println(Foo.classVar); // changed by f1
	        System.out.println(f2.classVar);  // changed by f1
//	      
	        f1.instanceVar = "changed by f1";
	        System.out.println(f1.instanceVar); // changed by f1
	        System.out.println(f2.instanceVar); // I instance var

		
		
	}

}
