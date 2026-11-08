package com.example.MonthlyMVC.entity;

import java.io.Serializable;
import java.util.Date;

import com.example.MonthlyMVCAnswer.entity.Prefecture;

import lombok.Data;

@Data
public class Mansion implements Serializable {
	private Integer id;
	private String name;
	private String address;
	private Integer prefectureId;
	private Integer monthlyPrice;
	private Date buildingDate;
	private String imagePath;
	private Boolean dataFlag;

	private Prefecture prefecture;
}
