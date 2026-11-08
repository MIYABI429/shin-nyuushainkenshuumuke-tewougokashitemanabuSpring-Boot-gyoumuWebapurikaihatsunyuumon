package com.example.MonthlyMVC.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Mansion implements Serializable {
	private Integer id;
	private String name;
	private String address;
	private Integer prefecturreId;
	private Integer monthlyPrice;
	private Date buildingDate;
	private String imagePath;
	private Boolean dataFlag;
}
