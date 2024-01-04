package com.winter.app.regions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.Region;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.SqlServerCallMetaDataProvider;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository //<-숙지하기
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	
	
	
	
	
	
	//detail
	public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail",regionDTO);
				
		
	}
	
	public List<RegionDTO> getList() throws Exception{
		return sqlSession.selectList(namespace+"getList");
	}

}