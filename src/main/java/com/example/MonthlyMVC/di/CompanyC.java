package com.example.MonthlyMVC.di;

import org.springframework.stereotype.Component;

@Component
public class CompanyC implements DBConnection {
	@Override
	public void connention() {
		System.out.println("C社の接続です。");
	}

}
