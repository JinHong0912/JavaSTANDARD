package inheritance;

class Book{
	
	String title;
	String genre;
	
	void printBook() {
		
		
//		title = "123";
//		genre = "sedsad";
//		
		
		System.out.println("제목 : "+title);
		System.out.println("장르 : "+genre);
		
		
	}
	
	
}

class Novel extends Book{
	String writer;
	
	void printNov() {
		
		printBook();
		System.out.println("저자 : " + writer);
		
	}
}


class Magazine extends Book{
	
	int day;
	void printMag() {
		printBook();
		System.out.println("발매일  : " + day + "일");
		
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		// 상속 실습 extends
		
		
//		Book b = new Book();
		
//		테스트
//		b.printBook();
//		System.out.println(b.genre);		
//		System.out.println(b.title);		
//		
		
		Novel nov = new Novel();
		
		nov.title = "구운몽";
		nov.genre = "고전문학";
		nov.writer = "김만중";
	
		Magazine msg = new Magazine();
		
		msg.title = "월간 자바 그림책";
		msg.genre = "컴퓨터";
		msg.day = 20;
		
		
		nov.printNov();
		System.out.println(  );
		msg.printMag();
		
	}
	
}
