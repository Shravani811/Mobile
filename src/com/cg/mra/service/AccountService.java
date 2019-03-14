package com.cg.mra.service;

import com.cg.mra.beans.Account;

public interface AccountService {
	Account getDetails(String mobileNo);
	int rechargeAccount(String mobileno,double rechargeAmount);
}
