package Oops2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank b=new HSBCBank();
		
		b.credit();
		b.debit();
		b.transfer();
		b.eduloan();
		b.carloan();
		b.mutualfund();
		System.out.println("***************");
		
		SCBank s=new SCBank();
		s.credit();
		s.debit();
		s.transfer();
		s.fixed();
		s.mutualfund();
	}

}
