package com.winter.app.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Product/*")
public class ProductController {
	
	@RequestMapping(value = "list", method =RequestMethod.GET)
	public void list() {
		
	}
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public void detail(ProductDTO productDTO) {
		
	}
}
