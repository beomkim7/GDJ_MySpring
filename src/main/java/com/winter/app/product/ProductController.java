package com.winter.app.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/products/*")
public class ProductController {
	
	
	private ProductDAO productDAO;
	

	
	@RequestMapping(value = "list",method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception {
		
		List<ProductDTO> ar = productDAO.getlist();
		request.setAttribute("list", ar);
		
		return "list";
	}
	
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public String detail(HttpServletRequest request) throws Exception {
		ProductDTO productDTO = new ProductDTO();
		String id = request.getParameter("productNum");
		
		productDTO.setProductNum(Long.parseLong(id));
		productDTO=productDAO.getdetail(productDTO);
		
		request.setAttribute("dto",productDTO);
		
		return "products/detail";
		
	}
}
