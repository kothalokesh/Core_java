package com.tns.Application;

import com.tns.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	public GSNormalAcc(int accNo,String accNm,float charges,float deliveryCharges)
	  {
		  super(accNo,accNm,charges,deliveryCharges);
	  }
	  @Override
	  public String toString()
	  {
		  return String.format("GSNormalAcc[toString=%s]",super.toString());
	  }
}
