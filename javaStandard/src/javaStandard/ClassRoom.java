package javaStandard;

class Test{
	
	String subject; // 필드 교과명
	int point; // 필드 점수
	
	public void setPoint(String s, int p) { // 점수를 설정 하는 메소드
		subject = s;
		point = p ;
		
	}
	
	String getPoint() { // 한 과목의 점수를 가져오는 메소드
		return subject + ":"+ point ;
	}

} // Test 끝 

class Student {
	
	int id; 		//필드 학생번호 
	String name;	//필드 이름
	int subnum;     //필드 과목수
	Test[] test;
	
	public Student(int i, String n ,int s){ //생성자
		id = i;
		name = n;
		subnum = s;
		test = new Test[s];
		for (int j = 0; j < s ; j++){
			
			test[j] = new Test();
		
		}
	}
	
	
	public String getName() { // 이름을 가져 오는 메소드
		
		return id + ":"+ name ;
	}
	
	 public int getGrade() { //  총점을 가지고 오는 메소드
		int sum = 0;
		for(int i = 0; i < subnum; i++) 
			sum += test[i].point;
		return sum;
	 }
	//메소드 오버로딩
	 public int getGrade(int a) { // 성적을 평가 하는 메소드
		int base = 100 * subnum / a;
		int rank = getGrade() /base + 1;
		
		return rank;
		
	}
	
	
	public void printScore() { // 성적을 표시하는 메소드
		System.out.println(getName());
		for(int i =0; i < subnum; i++) {
			System.out.println(test[i].getPoint()+" ");
			System.out.println();
			System.out.println("총점 " + getGrade());
			
			int rank = 5;
			System.out.println(rank+"단계평가 " +getGrade(rank));
			System.out.println();
		}
	}

}// Student 끝


public class ClassRoom {

	public static void main(String[] args) {
		
		Student kim = new Student(12, "김", 3);
		kim.test[0].setPoint("국어", 95);
		kim.test[1].setPoint("영어", 55);
		kim.test[2].setPoint("수학", 75);
		kim.printScore();
		
		Student lee = new Student(7, "이진", 3);
		lee.test[0].setPoint("국어", 95);
		lee.test[1].setPoint("영어", 85);
		lee.test[2].setPoint("수학", 15);
		lee.printScore();
	}
}
