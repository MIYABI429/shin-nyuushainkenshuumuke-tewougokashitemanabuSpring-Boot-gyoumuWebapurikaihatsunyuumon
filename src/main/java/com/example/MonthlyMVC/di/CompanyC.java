package com.example.MonthlyMVC.di;

public class CompanyC implements DBConnection {
	@Override
	public void connention() {
		System.out.println("C社の接続です。");
	}

}
