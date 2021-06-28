package classRoom;

public class Student {

	//필드 만들기
	int id;       // 필드 학생번호
	int subnum;   // 필드 과목수
	String name;  // 필드 학생 이름
	
	Test[] test;
	
	//테스트1
//	public void test1() {
//		id = 1;
//		subnum = 2;
//		name = "진";
//		
//		System.out.println(id);
//		System.out.println(subnum);
//		System.out.println(name);
//	}

	//생성자 생성
	public Student(int i, String n, int s) {
		id = i;
		name = n;
		subnum = s;
		test = new Test[s];
		
		for( int j = 0 ; j < s; j++) {
			test[j] = new Test();
		}
		
	}
	
	public String getName() {// 이름을 가져 오는 메소드
		return id +":"+ name;
	}
	
	int getGrade() {
		int sum = 0;
		for(int i = 0; i < subnum; i++) {// 총점을 가져 오는 메소드
			sum += test[i].point;
		}
		return sum;
		
	}

	//메소드 오버로딩
	public int getGrade( int a) { // 성적을 평가 하는 메소드
		int base = 100 * subnum / a;
		int rank = getGrade() / base + 1;
	return rank;
	}


	public void printScore() { // 성적을 표시하는 메소드
		
		System.out.println(getName());
		
		for(int i = 0;i< subnum ; i++) {
			System.out.println(test[i].getPoint()+ "  ");
			System.out.println();
			System.out.println("총점 " + getGrade());
			int rank = 5;
			System.out.println(rank + "단계평가 "+getGrade(rank));
			System.out.println();
		}
		
	}

}// class end
