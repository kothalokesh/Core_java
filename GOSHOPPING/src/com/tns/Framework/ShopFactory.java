package com.tns.Framework;

public abstract class ShopFactory {
	abstract public PrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrimeAcc);
	abstract public NormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float deliveryCharges);

}
