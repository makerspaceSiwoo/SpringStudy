package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DeptDao;
import com.spring.dto.Dept;

@Service
public class DeptService {
	
	@Autowired
	DeptDao dao; // bean으로 만들어진 객체는 DeptDao의 자손객체(자동으로 생성됨)
	
	public List<Dept> deptAll(){
		return dao.deptAll();
	}
	
	public int insertDept(Dept dept) {
		return dao.insertDept(dept);
	}
	
	public int newNo() {
		return dao.newNo()+ 10;
	}
	
	

}
