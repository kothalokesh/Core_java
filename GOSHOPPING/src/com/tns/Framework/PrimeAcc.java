package com.tns.Framework;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	static private final float deliveryCharges=0.0f;
	public PrimeAcc(int accNo,String accNm,float charges,boolean isPrime)
	{
		super(accNo,accNm,charges);
		this.isPrime=isPrime;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account no is"+this.getaccNo());
	}
	@Override
	public String toString()
	{
		return String.format("PrimeAcc[isPrime=%s,toString=%s]",isPrime,super.toString());
	}

}
