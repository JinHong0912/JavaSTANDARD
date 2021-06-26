package classRoom;

public class Student {

	//필드 만들기
	int id;       // 필드 학생번호
	int subnum;   // 필드 과목수
	String name;  // 필드 학생 이름
	
	Test[] test;
	
	//테스트1
	public void test1() {
		id = 1;
		subnum = 2;
		name = "진";
		
		System.out.println(id);
		System.out.println(subnum);
		System.out.println(name);
	}
	
}
