package javaTast;

import javax.swing.Spring;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 1 : Addressbook 객체를 생성하고 이름과 전화번호를 따로 출력해 보시오
		Addressbook ab = new Addressbook("stevelee","01011112222"); // 객체 생성
		
		System.out.println(ab.getName());
		System.out.println(ab.getPhoneNum());
		
		// 문제 2 : Employee 생성자 실행 시 폰번호가 Phonebook에 들어감과 동시에 아래처럼 3가지로 나뉘어 변수에도 들어가게 추가 코딩하고 값을 넣어
		//         printPhoneSplit 실행해 출력해보시오
		//        "통신사번호 : " + phone1 + "/앞4자리:" +phone2  + "/뒤4자리:" +phone3
		
		Employee em = new Employee("stevelee","01011112222");
		Employee em2 = new Employee("stevelee","01011112222");
		
		//em.companyName = "stevelee";
		//System.out.println(em2.companyName);
		//System.out.println(employee.companyName);
		
		
//		em.getName();
//		em.getPhoneNum();
//		
		
		//String aa = "0101010101";
		//aa.substring(beginIndex)
		
		// 답을 잘라서 넣는다
		
		// 문제 3 : Employee의 회사 이름은 모두 동일할 것이다. 객체 2개를 만들어서 첫번째 객체에서 회사이름을 넣어도
		//         두번째 객체에서 같은 회사 이름이 되도록 코드를 수정하고 두 객체의 회사이름을 출력해 보시오
		//
		// 
		//static String companyName; // static 을 넣는다.
		
		// 문제 4 : 변수에 직접 접근해서 값을 셋팅해도 되는데 왜 private으로 만들어 setter를 이용해
		//         값을 넣도록 해야 할까? 생각해보고 setter를 완성해 보시오
		
		
		
	}

}
