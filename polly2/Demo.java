package polly2;

import polyyy.Demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings_account s1 = new Savings_account();
		s1.setBalancs(5000);
		s1.setName("Rakesh");
		s1.setId(103);
		s1.setMin_bal(500);
		System.out.println(s1.getId() + ":" + s1.getName() + ":" + s1.getBalancs());
		System.out.println("______________________________");
		current_account s2 = new current_account();
		s2.setId(102);
		s2.setName("Gagan");
		s2.setMin_bal(1000);
		s2.setBalancs(10000);
		System.out.println(s2.getId() + ":" + s2.getName() + ":" + s2.getBalancs());
		s1.cal_bal();
		s2.cal_bal();
		service.showdetails(s1);
		service.showdetails(s2);

	}

}
