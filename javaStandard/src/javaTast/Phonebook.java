package javaTast;

public class Phonebook {
	
	private String name;
	private String phoneNum;


	public Phonebook(String t1, String t2) {
		name = t1;
		phoneNum = t2;
	}	
	
	public void printPhonebook() {
		System.out.println("name:" + name + " / phoneNum:" + phoneNum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	

}
