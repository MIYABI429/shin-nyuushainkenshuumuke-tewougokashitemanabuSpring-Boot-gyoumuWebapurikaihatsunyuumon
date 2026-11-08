package com.example.MonthlyMVCAnswer.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Prefecture implements Serializable {
	private Integer id;
	private String prefecture;
	private Integer maxMonthlyPrice;
	private Boolean dataFlag;
}