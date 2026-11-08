package com.example.MonthlyMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.MonthlyMVC.service.PrefectureService;

@Controller
@RequestMapping("prefectureList")
public class PrefectureListController {
	@Autowired
	PrefectureService prefectureService;

	@GetMapping
	public String prefectureList(Model model) {
		model.addAttribute("prefectureList", prefectureService.selectAll());
		return "prefecture/prefectureList";
	}
}