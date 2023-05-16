package com.money;


public  abstract class BankAcc 
{	
	private  int accNo;
	private String accNm;
	private float accBal;
	
	


	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float a)
	{
		System.out.println("Account BankAcc withdrawl method");
	}
	
	public void deposite(float b)
	{
		System.out.println("bankAcc deposite method");
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public int getAccNo() {
		return accNo;
	}


	public float getAccBal() 
	{
		return accBal;
	}
	

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	
	
}
