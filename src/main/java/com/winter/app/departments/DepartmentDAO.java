package com.winter.app.departments;

import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.departments.DepartmentDAO.";
	
	
	public List<DepartmentDTO> getList() {
		return sqlSession.selectList(namespace+"getList"); 
	}
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO) {
		return sqlSession.selectOne(namespace+"getDetail",departmentDTO);
	}
}