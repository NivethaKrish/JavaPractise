package Oops2;

public class HSBCBank implements USBank,UKBank{
	
	public void credit()
	{
		System.out.println("credit");
	}
	
	public void debit()
	{
		System.out.println("debit");
	}
	
	public void transfer()
	{
		System.out.println("transfer");
	}
	
	public void mutualfund()
	{
		System.out.println("mutual fund");
	}
	
	public void carloan()
	{
		System.out.println("carloan");
	}
	
	public void eduloan()
	{
		System.out.println("eduloan");
	}
	
	
}
