package com.example.MonthlyMVC.di;

//@Component
public class CompanyB implements DBConnection {
	@Override
	public void connention() {
		System.out.println("B社の接続です。");
	}
}
