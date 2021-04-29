package JavaStudy;

public class Printer {

	
	private static int totalCount = 0;
	public int count2 = 0;
	
	public void print(String str) {
		totalCount++;
		count2++;
		System.out.println(str);
	
		
		
	}
	public int getTotalCount2() {
		return totalCount;
	}
	public static int getTotalCount() {
		return totalCount;
	}
	
}
