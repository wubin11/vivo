package com.jk1603.vivo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jk1603.vivo.admin.pojo.Entry;
import com.jk1603.vivo.admin.service.EntryService;

@Controller
@RequestMapping("/vivoadmin")
public class AdminController {
	
	@Autowired
	EntryService entryService;
	
	@RequestMapping(value="/get" ,method=RequestMethod.GET)
	public String get(Entry param ,Model model) {
		List<Entry> result = entryService.get(param);
		model.addAttribute("entrys" ,result);
		return "vivoback";
	}
}
