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
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductContents(rs.getString("PRODUCTCONTENTS"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
			
			ar.add(productDTO);
		}
		DBConnector.disConnect(rs, st, con);
//PRODUCTNUM
//PRODUCTNAME
//PRODUCTCONTENTS
//PRODUCTRATE
//PRODUCTJUMSU
		return ar;
	}
	
	public ProductDTO getdetail(ProductDTO productDTO) throws Exception {
		
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTNUM=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, productDTO.getProductNum());
		ResultSet rs = st.executeQuery();
		rs.next();
		productDTO.setProductName(rs.getString("PRODUCTNAME"));
		productDTO.setProductContents(rs.getString("PRODUCTCONTENTS"));
		productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
		productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
		
		DBConnector.disConnect(rs, st, con);
		
		return productDTO;
		
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
