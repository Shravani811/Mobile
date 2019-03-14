package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	AccountDao accDao = new AccountDaoImpl();
	@Override
	public Account getDetails(String mobileNo) {
		
		return accDao.getDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		
		return accDao.rechargeAccount(mobileno, rechargeAmount);
	}
	
	
	
}
