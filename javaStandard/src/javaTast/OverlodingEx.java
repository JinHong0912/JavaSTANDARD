package javaTast;

class Cat{
	
	String name;
	String place;
	int age;
	
	//오버 로딩
	
	void setData(String n , String p, int a) {
		name = n;
		place = p ;
		age = a;
		
	}
	
	void print() {
		System.out.println(place +" : " +name+":"+age+":");
	}
	
	void print(String p, int a) {
		
		place = p ;
		System.out.println(p +" : " +":"+a+":");
		
		
	}

	void print(String variety) {
		System.out.println();
		System.out.println(place +" : " +name+":"+age+":" + variety);
	}
}

public class OverlodingEx {

	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();

		cat1.setData("로", "집", 11);
		cat2.setData("나", "집으로", 12);
		cat1.print("말티즈");
		cat2.print();
		cat3.print("우리집", 0);
		
		
	}
}
