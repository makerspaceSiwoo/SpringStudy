package com.spring.dto;

import lombok.Data;

@Data
public class Dept { //클래스명 == 테이블명
	private int deptno; // 컬럼명에 맞춰서 변수명을 만들면 자동으로 들어감 변수명==칼럼명
	private String dname;
	private String loc;

}
