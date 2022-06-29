package com.tns.Application;

import com.tns.Framework.ShopFactory;

public class GSShopFactory extends ShopFactory{
	
	public GSPrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime){
		GSPrimeAcc p= new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
			 }
	public GSNormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float deliveryCharges)
			 {
				 GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
				 return n;
}
}
