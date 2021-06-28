package classRoom;

public class ClassRoom {
	
	public static void main(String[] args) {
		
		//클래스 명을 쪼개고 가지고 와 보기
		System.out.println("성적 프로그램 만들기");
			
		//Jin.test1();
		Student jin = new Student(12, "진", 3);

		jin.test[0].setPoint("국어", 95);
		jin.test[1].setPoint("영어", 83);
		jin.test[2].setPoint("수학", 76);
		jin.printScore();

		Student kim = new Student(7, "김", 3);
		kim.test[0].setPoint("국어", 61);
		kim.test[1].setPoint("영어", 97);
		kim.test[2].setPoint("수학", 72);
		kim.printScore();
		
		
		
		
	}

}
