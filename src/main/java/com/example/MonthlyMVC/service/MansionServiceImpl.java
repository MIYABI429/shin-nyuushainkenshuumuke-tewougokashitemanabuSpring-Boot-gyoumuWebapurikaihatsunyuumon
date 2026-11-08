package com.example.MonthlyMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.MonthlyMVC.entity.Mansion;
import com.example.MonthlyMVC.repository.MansionRepository;

@Service
@Transactional

public class MansionServiceImpl implements MansionService {
	@Autowired
	MansionRepository mansionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Mansion> selectAll() {
		return mansionRepository.selectAll();
	}
}