package com.example.MonthlyMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.MonthlyMVC.service.MansionService;

@Controller
@RequestMapping("mansionList")
public class MansionListController {
	@Autowired
	MansionService mansionService;

	@GetMapping
	public String mansionList(Model model) {
		model.addAttribute("mansionList", mansionService.selectAll());
		return "mansion/mansionList";
	}

}