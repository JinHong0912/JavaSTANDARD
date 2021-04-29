package JavaStudy;

public class hello {

	
	public static void main(String[] args) {
		
		Printer pt1 = new Printer();
		Printer pt2 = new Printer();
		Printer pt3 = new Printer();
	

		pt1.print("dsadsadasda");
		pt3.print("dsadsadasda");
		pt2.print("dsadsadasda");
		pt1.print("dsadsadasda");
		pt3.print("dsadsadasda");
		
		
		pt1.getTotalCount2();
		System.out.print(pt1.getTotalCount());
		System.out.print(pt1.getTotalCount2());
		
		System.out.print(Printer.getTotalCount());
		
		
		
		
		
		
		
	}
}
