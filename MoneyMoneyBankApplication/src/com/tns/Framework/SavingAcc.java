package com.tns.Framework;
public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
 static final private float MINBAL=0.0f;
	
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) 
	{
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Account no is"+this.getaccNo());
	}
	
	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s]",isSalaried);
	}
	


}
