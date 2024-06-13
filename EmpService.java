package com.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DeptDao;
import com.spring.dao.EmpDao;
import com.spring.dto.Dept;
import com.spring.dto.Emp;

@Service
public class EmpService {

	@Autowired
	EmpDao emp;
	@Autowired
	DeptDao dep;
	
	public List<Emp> searchEmp(String ename, String job){
		Map<String, String> map = new HashMap<>();
		map.put("ename", ename);
		map.put("job", job);
		return emp.searchEmp(job, ename);
	}
	
	public List<Dept> showOption(){
		return dep.deptAll(); // 부서 정보를 전부 가져옴
	}
	
	public List<Emp> showEmp(int deptno){
		return emp.showEmp(deptno);
	}
	
	public Emp selectEmp(String ename){
		return emp.selectEmp(ename);
	}
	
	
	
	
	
}
