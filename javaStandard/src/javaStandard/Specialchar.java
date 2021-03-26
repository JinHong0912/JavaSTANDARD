package javaStandard;

public class Specialchar {
	
	public static void main(String[] args) {
		
		//[예제 2-3]
		char single ='\'';   //single ='''; 와 같이 할 수 없다.
		String dblQuote="\"Hello\""; // 큰 따움표를 출력하면 이렇게 한다.
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root+"\n");
	
	
		//char형 변수는 단 하나만 저장이 가능하다
		//여러 문장을 저장하기 위해서는 String클래스를 사용해야한다.
		
		char ch = 'J'; //char ch = 'Java' ; 이렇게 할 수 없다.
		//String name = "Java";
		String name = "Ja"+"va";// name 에는 "Java"가 저장 된다.
		
		
		System.out.println(ch);
		System.out.println(name);
	
	
	}
	

}
