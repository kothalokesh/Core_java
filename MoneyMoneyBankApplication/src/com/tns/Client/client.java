package com.tns.Client;

import com.tns.Framework.BankFactory;
import com.tns.Framework.*;
import com.tns.Application.*;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankFactory b =new MMBankFactory();
		SavingAcc s= new MMSavingAcc(809698682,"kothapalli lokesh", 30000, true);
		CurrentAcc c = new MMCurrentAcc(964202412,"Ayesh", 35000,10000);
		System.out.println("Saving Account");
		s.withdraw(s.getaccBal());
		System.out.println("Current Account");
		c.withdraw(c.getaccBal());
		System.out.println(b.getNewSavingAcc(798163,"manoj",80000,true));
		System.out.println(b.getNewCurrentAcc(970313,"Arun",50000,1000));
		System.out.println(c);
		System.out.println(s);
	}
}
