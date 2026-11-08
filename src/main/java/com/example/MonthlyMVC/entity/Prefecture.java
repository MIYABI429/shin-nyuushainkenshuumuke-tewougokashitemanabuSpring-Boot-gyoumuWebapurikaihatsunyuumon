package com.example.MonthlyMVC.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Prefecture implements Serializable {
	private Integer id;
	private String prefecture;
	private Integer maxMonthlyPrice;
}