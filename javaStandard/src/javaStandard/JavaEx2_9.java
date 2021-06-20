package javaStandard;

public class JavaEx2_9 {

	
	public static void main(String[] args) {
		

		int i;
		
		int [ ] a = {1, 2, 3};
		
		
		
		if(a.length == 0)
				System.out.println("커맨드라인 인수가 없습니다."); 
	
		else for(i = 0; i < a.length; i++)
				System.out.println((i+1) +" : "+a[i]);

		
	}
}
