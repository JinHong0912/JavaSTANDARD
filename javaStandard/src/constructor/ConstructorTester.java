package constructor;

public class ConstructorTester {
	
	public static void main(String[] args) {
		
		

		Human hm_3 = new Human();
		int hm_3_height = hm_3.getHeight();
		String hm_3_name = hm_3.getName();
		
		System.out.println("이름: "+hm_3_name+", 키 : "+hm_3_height);
	
		hm_3.setName("새이름");
		hm_3.setHeight(185);
		
		hm_3_height =  hm_3.getHeight();
		hm_3_name = hm_3.getName();
		
		System.out.println("이름 : "+hm_3_name+", 키: "+hm_3_height);
	
	}

}
