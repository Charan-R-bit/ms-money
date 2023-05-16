package com.money;

import com.money.exception.lowBalanceException;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(float MINBAL) 
	{
		try
		{
			if(getAccBal()>MINBAL && getAccBal()>getCreditLimit())
			{
				setAccBal(getAccBal()-MINBAL);
				System.out.println("Eligible for withdrawal: Balance after withdrawal is :"+getAccBal());
			}
			else
			{
//				throw new lowBalanceException("Available balance is low ");
				System.out.println("Available balance is low: Transaction failed");
			}
		}
		catch(Exception e)
		{
			
			System.out.println("Exception caught!!");
		}	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
