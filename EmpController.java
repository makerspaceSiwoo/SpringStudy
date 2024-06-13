package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.spring.dto.Dept;
import com.spring.dto.Emp;
import com.spring.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	EmpService eservice;
	
	@GetMapping("/emp/form")
	public String form() {
		return "emp/form";
	}
	
	@PostMapping("/emp/search")
	public String searchEmp(@ModelAttribute("ename") String ename, @ModelAttribute("job")String job, Model m) {
		List<Emp> elist = eservice.searchEmp(ename,job);
		m.addAttribute("elist",elist);
		return "emp/result";
	}

	@GetMapping("/emp/option")
	public String showOption(Model m){
		List<Dept> dlist = eservice.showOption(); // 부서 정보 리스트
		m.addAttribute("deptinfo",dlist);
		return "emp/option";
	}
	
	@GetMapping("/emp/select1")
	@ResponseBody
	public String showEmp(@RequestParam("deptno") int deptno) {
		List<Emp> elist = eservice.showEmp(deptno);
		// 해당 부서번호의 emp리스트를 gson으로 전달
		Gson gson = new Gson();
		return gson.toJson(elist);
	}
	
	@GetMapping("/emp/select1/select2")
	@ResponseBody
	public String selectEmp(@RequestParam("ename") String ename) {
		Emp e = eservice.selectEmp(ename);
		Gson gson = new Gson();
		return gson.toJson(e);
	}
	
	

}
