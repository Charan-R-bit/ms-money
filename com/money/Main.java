package com.money;

import java.util.Scanner;

public class Main 
	{
		public static void main(String args[])
		{
			BankFactory  bankfactory = new MMBankFactory();
			SavingAcc s = new MMSavingAcc(111212, "Charan", 21212f, true);
			CurrentAcc c = new MMCurrentAcc(21212, "Charu", 21211f, 200f);
			s.withdraw(200);
			c.withdraw(100);
			s.toString();
			c.toString();
		}
		

	}


