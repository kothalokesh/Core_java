package com.tns.client;

import com.tns.Application.GSNormalAcc;
import com.tns.Application.GSPrimeAcc;
import com.tns.Application.GSShopFactory;
import com.tns.Framework.NormalAcc;
import com.tns.Framework.PrimeAcc;
import com.tns.Framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(9642,"rajesh",25000,true);
		NormalAcc n=new GSNormalAcc(8012,"mahesh",35000,1000);
		System.out.println("Prime account");
		p.bookProduct(p.getcharges());
		System.out.println("Normal account");
		n.bookProduct(n.getcharges());
		System.out.println(s.getNewPrimeAcc(965,"suresh",50000,true));
		System.out.println(s.getNewNormalAcc(105,"naresh",10000,5000));
		System.out.println(p);
		System.out.println(n);

	}

}
