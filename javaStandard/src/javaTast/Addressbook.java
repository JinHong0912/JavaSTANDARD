package javaTast;

public class Addressbook extends Phonebook {
	
	String addr1;
	String addr2;

	
	public Addressbook(String tt1,String tt2) {
		
		super(tt1, tt2);
		
	}
	
	
	/*
	public Addressbook(String tt1,String tt2,String tt3,String tt4) {
		super(tt1,tt2);
		addr1 = tt3;
		addr2 = tt4;
	}
	*/
	
	public void printAddr() {
		System.out.println("기본주소:" + addr1 + "/상세주소:" + addr2);
	}
	
	public void printPhoneAddr() {
		
		/*
		printPhonebook();
		printAddr();
		*/
		
		System.out.println("name:" + super.getName() + " / phoneNum:" + super.getPhoneNum() + "기본주소:" + addr1 + "/상세주소:" + addr2);
	}
}
