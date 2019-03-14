package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.ExceptionHandling;
import com.cg.mra.exceptions.RechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;


public class MainUI {
	void selection() {
		Scanner input=new Scanner(System.in);
		do {
		System.out.println("enter 1.Account Balance Enquiry 2.Recharge Account 3.Exit");
		int choice=input.nextInt();
		AccountService accService = new AccountServiceImpl();
		switch(choice) {
		case 1:
			System.out.println("enter mobile number");
			String mobileNo=input.next();
			
			Account  acc = accService.getDetails(mobileNo);
			if(acc.getAccountBalance()>=0) {
				System.out.println("Your Current Balance"+acc.getAccountBalance());
			}
			else {
				try {
					throw new ExceptionHandling();
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
			break;
		case 2:
			System.out.println("enter mobile number");
			String mobileNum=input.next();
			Account  acc1 = accService.getDetails(mobileNum);
			if(acc1.getAccountBalance()>=0) {
				System.out.println("enter recharge amount");
				Double rechargeAmount=input.nextDouble();
				int balance = accService.rechargeAccount(mobileNum, rechargeAmount);
				System.out.println("Your account recharged successfully");
				System.out.println("Hello"+acc1.getCustomerName()+"Available Balance is"+balance);
			}
			else {
				try {
					throw new RechargeException();
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
			break;
			
			
		case 3:
			System.exit(0);
			break;
			
		}
		}while(true);
	}
	
	
	public static void main(String[] args) {
		MainUI m = new MainUI();
		m.selection();

	}

}
