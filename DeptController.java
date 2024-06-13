package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.dto.Dept;
import com.spring.service.DeptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class DeptController {
	@Autowired
	DeptService dservice;
	
	@GetMapping("/deptAll")
	public String deptAll(Model m) {
		List<Dept> dlist = dservice.deptAll();
		m.addAttribute("deptAll",dlist);

		return "dept/deptAll";
	}	
	
	@GetMapping("/dept/form") // 부서 번호 자동완성
	public String form(Model m) {
		m.addAttribute("deptno",dservice.newNo());
		return "dept/form";
	}
	@PostMapping("/dept/insert")
	public String insert(Model m, Dept d) {
		dservice.insertDept(d);
		
		List<Dept> dlist = dservice.deptAll();
		m.addAttribute("deptAll",dlist);
		
		return "dept/result";
	}
	
	
	
	
}
