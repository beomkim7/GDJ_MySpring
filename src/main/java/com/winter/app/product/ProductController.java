package com.winter.app.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/products/*")
public class ProductController {
	private ProductDAO productDAO;

	public ProductController () {
		this.productDAO = new ProductDAO();
	}
	
	
	@RequestMapping(value = "list", method =RequestMethod.GET)
	public String list(Model model) throws Exception{

		
		List<ProductDTO> list = productDAO.getlist();
		model.addAttribute("list", list);
		return "products/list";
	}
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		Long id = Long.parseLong(request.getParameter("id")); 

		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(id);
		productDTO = productDAO.getdetail(productDTO);
		model.addAttribute("dto", productDTO);
		return "products/detail";
	}
}
