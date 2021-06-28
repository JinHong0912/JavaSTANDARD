package classRoom;

public class Test {
	
	String subject; // 필드 교과명
	int point;      // 필드 점수

	void setPoint(String s, int p) { // 점수를 설정하는 메소드 
		subject  = s;
		point = p ;
	}
	
	public String getPoint() { // 한 과목의 점수를 가져 오는 메소드
		return subject + ":"+ point;
	}
	
}
