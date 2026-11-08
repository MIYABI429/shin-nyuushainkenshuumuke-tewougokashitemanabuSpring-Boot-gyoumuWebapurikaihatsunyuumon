package com.example.MonthlyMVC.di;

import org.springframework.stereotype.Component;

@Component
public class CompanyA implements DBConnection {
	@Override
	public void connention() {
		System.out.println("A社の接続です。");
	}
}
