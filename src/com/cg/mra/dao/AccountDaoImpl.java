package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao{
	Map<String,Account> accountEntry;
	Account acc = new Account();
		public AccountDaoImpl()
		{
			accountEntry = new HashMap<>();
			accountEntry.put("9010210131",new Account("Prepaid","Vaishali",200));
			accountEntry.put("9823920123",new Account("Prepaid","Megha",453));
			accountEntry.put("9932012345",new Account("Prepaid","Vikas",631));
			accountEntry.put("9010210131",new Account("Prepaid","Anju",521));
			accountEntry.put("9010210131",new Account("Prepaid","Tushar",632));
		}
		
		
	@Override
	public Account getDetails(String mobileNo) {
		
		if(accountEntry.containsKey(mobileNo)) {
			acc=accountEntry.get(mobileNo);
			
		}
		else {
			acc.setAccountBalance(-1);
		}
		return acc;
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		
		   acc=accountEntry.get(mobileno);
		   
		   rechargeAmount = rechargeAmount+acc.getAccountBalance();
		   acc.setAccountBalance(rechargeAmount);
			accountEntry.replace(mobileno, acc);
		
		
		return (int) acc.getAccountBalance();
	}

}
