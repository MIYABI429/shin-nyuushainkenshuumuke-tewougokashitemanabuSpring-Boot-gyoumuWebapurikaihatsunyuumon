package com.example.MonthlyMVC;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.MonthlyMVC.di.DBConnection;

@SpringBootApplication
@MapperScan("com.example.MonthlyMVC.repository")
public class MonthlMvcApplication {
	@Autowired
	DBConnection dbConnection;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MonthlMvcApplication.class, args);

		//context.getBean(MonthlMvcApplication.class).connectionTest();
	}

	//public void connectionTest() {
	//	dbConnection.connention();
}
