package javaStandard;

class Book{
	
	String title;
	String writer;
	
	Book(String t, String w){
		title  = t;
		writer = w;
	}
	
	Book(Book copy) {
		title  = copy.title;
		writer = copy.writer;
	}
	
	void print(){
		
		System.out.println("제  목 : " + title);
		System.out.println("저  자 : " + writer); 
		
	}
}

public class JavaEx2_8 {

		public static void main(String [] args){
			
			Book book1 = new Book("C 가 보이는 그림책" , "ANK");
			book1.print();
			
			Book book2 = new Book(book1);
			book2.title = "Java가 보이는 그램책";
			book2.print();
			
		}
		
	}
	
