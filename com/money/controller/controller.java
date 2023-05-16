package com.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.money.MMBankFactory;
import com.money.MMSavingAcc;
import com.money.SavingAcc;

@Controller
@RequestMapping("/getSavingAcc")
public class controller 
{
	MMSavingAcc mmsavingAcc;
	MMBankFactory mmbankfactory;
	@GetMapping("/get")
	@ResponseBody
	public String get()
	{
		return "welcome to get" ;
	}

	
}
