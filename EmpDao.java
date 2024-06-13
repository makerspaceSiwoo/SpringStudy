package com.spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.spring.dto.Emp;

@Mapper
public interface EmpDao {

	List<Emp> searchEmp(@Param("job") String job, @Param("ename") String ename);

	@Select("select * from emp")
	List<Emp> searchAll();
	
	@Select("select * from emp where deptno=#{deptno}")
	List<Emp> showEmp(@Param("deptno") int deptno);
	
	@Select("select * from emp where ename=#{ename}")
	Emp selectEmp(@Param("ename")String ename);
	
	
	
	
}
