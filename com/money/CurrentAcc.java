package com.money;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;

	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withdraw(float MINBAL) {
		try {
			if (getAccBal() > MINBAL && getAccBal() < getCreditLimit()) {
				System.out.println("Eligible for withdrawal");
			} else {
				System.out.println("Credit limit reached/ minimum balance reached");
			}
		} catch (Exception e) {
			System.out.println("Exception caught!!");
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
