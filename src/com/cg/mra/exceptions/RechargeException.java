package com.cg.mra.exceptions;

public class RechargeException extends Exception{

	
	public RechargeException(){
		System.out.println("cannot recharge account as Given mobile no does not exist");
	}
}
