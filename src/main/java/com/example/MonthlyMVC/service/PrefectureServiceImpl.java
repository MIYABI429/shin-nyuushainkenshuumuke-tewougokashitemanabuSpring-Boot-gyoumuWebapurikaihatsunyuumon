package com.example.MonthlyMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.MonthlyMVC.entity.Prefecture;
import com.example.MonthlyMVC.repository.PrefectureRepository;

@Service
@Transactional
public class PrefectureServiceImpl implements PrefectureService {
	@Autowired
	PrefectureRepository prefectureRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Prefecture> selectAll() {
		return prefectureRepository.selectAll();
	}
}