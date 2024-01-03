package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class ProductDAO {
	public List<ProductDTO> getlist() throws Exception{
		Connection con = DBConnector.getConnector();
		
		String sql="SELECT * FROM PRODUCT";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<ProductDTO> ar = new ArrayList<ProductDTO>();
		
		while(rs.next()) {
			ProductDTO productDTO = new ProductDTO();
			int n = 
		}
		
	}
	
	public ProductDTO getdetail(ProductDTO productDTO) {
		return null;
	}
	
	public int add(ProductDTO productDTO) {
		return 0;
	}
	public int update(ProductDTO productDTO) {
		return 0;
	}
	public int delete(ProductDTO productDTO) {
		return 0;
	}
}
