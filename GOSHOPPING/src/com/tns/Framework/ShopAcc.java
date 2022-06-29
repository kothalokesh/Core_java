package com.tns.Framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	public ShopAcc(int accNo,String accNm,float charges) {
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
	}
	abstract public void bookProduct(float charges);
	public void items(float charges) {
		System.out.println(charges);
	}
	public String getaccNm()
	{
		return accNm;
	}
	
	public int getaccNo()
	{
		return accNo;
	}
	public float getcharges()
	{
		return charges;
	}
	@Override
	public String toString()
	{
		return String.format("ShopAcc[accNo=%s,accNm=%s,charges=%s]",accNo,accNm,charges);
	}
}
