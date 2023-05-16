package com.money;

public abstract class SavingAcc extends BankAcc {

	private  boolean isSalaried;
	private static final float MINBAL = 200f;
	
	

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float withdrawamt) 
	{
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

	@Override
	public String toString() {
		return "SavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
