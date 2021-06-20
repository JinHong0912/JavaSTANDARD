package javaStandard;

class Cat{
	String name;
	String place;
	int age;

	void setData(String n,String p ,int a){

		name  = n;
		place = p;
		age   = a;

	}
	//1
	void print(){
		
		System.out.println(place + ":" + name + "  " + age + "살");

	}
	//2
	void print( String p , int a ){
		
		place = p;
		System.out.println(place +": 고양이는  "+ a + "마리입니다.");
	}

	//3
	void print(String variety){
		
		System.out.println(place +":"+name+"  "+ age +" 세 "+ variety);


	}

}

public class JavaEx2_6 {


	public static void main(String[] args) {
					
				Cat cat1 = new Cat();
				Cat cat2 = new Cat();
				Cat cat3 = new Cat();
				
				cat1.setData("로빈" , "우리집" , 10);
				cat2.setData("아이" , "옆 집" , 14 );

				cat1.print("잡종");//3
				cat2.print();//1
				cat3.print("우리집" , 0);//2

	}

}
