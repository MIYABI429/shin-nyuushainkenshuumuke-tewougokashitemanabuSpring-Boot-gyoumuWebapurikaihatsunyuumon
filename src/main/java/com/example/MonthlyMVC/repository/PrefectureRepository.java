package com.example.MonthlyMVC.repository;

import java.util.List;

import com.example.MonthlyMVC.entity.Prefecture;

public interface PrefectureRepository {
	List<Prefecture> selectAll();
}