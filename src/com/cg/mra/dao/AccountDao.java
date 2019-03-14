package com.cg.mra.dao;

import com.cg.mra.beans.Account;

public interface AccountDao {
	Account getDetails(String mobileNo);
	int rechargeAccount(String mobileno,double rechargeAmount);
}
