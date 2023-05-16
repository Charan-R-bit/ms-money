package com.money;

import com.money.exception.lowBalanceException;

public class MMSavingAcc extends SavingAcc
{
	
	private static final float MINBAL =200;
	

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	

	@Override
	public void withdraw(float withdrawamt) 
	{
//			System.out.println("MMsaving account  eligible for transaction: "+withdrawalamt);	
		try
		{
			if (this.MINBAL < getAccBal()&& withdrawamt>0)	
			{
				setAccBal(getAccBal()-withdrawamt);
				System.out.println("Balance Above Minimum balance eligible for transaction: your balance after withdrawal :"+getAccBal());
			} else {
				System.out.println("Your balance is less than " + this.MINBAL + "\tTransaction failed...!! :"+getAccBal());
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught!!");
		}
	}
		

	
	
//	public void withdraws() throws lowBalanceException
//	{
//		
//			throw new lowBalanceException("Exception caught!!");
//		
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
