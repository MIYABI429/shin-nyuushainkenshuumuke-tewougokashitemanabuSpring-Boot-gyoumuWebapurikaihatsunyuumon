package com.example.MonthlyMVC.repository;

import java.util.List;

import com.example.MonthlyMVC.entity.Mansion;

public interface MansionRepository {

	List<Mansion> selectAll();
}
