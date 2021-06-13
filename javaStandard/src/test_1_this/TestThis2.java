package test_1_this;

public class TestThis2 {

	private boolean power1;
	
	public TestThis2() {
	
		System.out.println("기본");
	}
	
	public TestThis2(boolean power2) {
		System.out.println("처음 받음"+ power2);
		
		System.out.println("private 받음 : "+this.power1);
		
		power1 = power2;
		//System.out.println(power1);
		
		System.out.println("this.power1 = power1 받음 : "+ this.power1);
		System.out.println("추가");
	}
	
	public boolean getPower1() {
		
		return power1; 
	}
}
