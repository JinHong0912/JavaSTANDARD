package javaCh6;

class Print{
	
 	public static String delimiter = "";
	public static void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

	
}


public class MyOOP {
	

	public static void main(String[] args) {
		
		Print.delimiter = "------------";
		Print.A();
		Print.A();
		Print.B();
		Print.B();

		Print.delimiter = "************";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		
		
		
		int y =6;
		
		while (y-- > 0) {
			int x = 1;
			x++ ;
			System.out.println(x);
		}
		System.out.println(y);
	}

}
