package com.example.MonthlyMVC.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceTest {
	@Before("execution(* com.example.MonthlyMVC.di.*.*(..))")
	public void beforeAdvice() {
		System.out.println("BeforeAdviceTestです");
	}
}