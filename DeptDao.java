package com.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.dto.Dept;

//DeptDao + mapper(xml)파일 합쳐서 구현 객체(bean)생성 
@Mapper
public interface DeptDao {
//	@Select("select * from dept order by deptno")
	List<Dept> deptAll(); // mapper xml 파일의 sql문 id와 메소드 이름이 같아야 함.
	//-> 자동으로 sql 문 사용할 수 있도록, 오버라이딩 해줌
	// select * from dept order by deptno 문 수행 -> List<Dept>에 저장하도록(자바객체로) 자동 오버라이딩
	int insertDept(Dept dept);
	
	Dept deptOne(int deptno);
	
	int deptCount();
	
	int newNo();
	
	
	
}
