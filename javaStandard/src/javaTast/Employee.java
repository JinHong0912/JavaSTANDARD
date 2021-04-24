package javaTast;
public class Employee extends Addressbook {
	
	
	String department;
	String position;
	private int age;
	String phone1,phone2,phone3;
	
	//String companyName;
	
	

	public Employee(String tt1, String tt2) {
		super(tt1, tt2);
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	public void printPhoneSplit() {
		System.out.println("통신사번호 : " + phone1 + "/앞4자리:" +phone2  + "/뒤4자리:" +phone3);
	}

	public void setAge(int num1) {
		
		if(num1 < 1) {
			
		}else age = num1;
		//age = num1;
		
	}
	
	public int getAge() {
		
		return age;
	}
	
	/*
	static public void setCompanyName(String comname) {
		companyName = comname;
	}
	
	static public void printCompany() {
		System.out.println("회사이름:" + companyName);
	}
	*/
	
	
}
