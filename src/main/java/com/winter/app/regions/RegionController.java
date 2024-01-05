package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	@Autowired //<-숙지하기	
	private RegionService regionService;
	
//	public RegionController() {
//		this.regionDAO = new RegionDAO();
//		
//	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(RegionDTO regionDTO, Model model) throws Exception{
//		String id = request.getParameter("region_id");
//		String name = request.getParameter("region_name");
//		
//		RegionDTO regionDTO = new RegionDTO();
//		regionDTO.setRegion_id(Integer.parseInt(id));
//		regionDTO.setRegion_name(name);
		
		
		
		int result = this.regionService.add(regionDTO);
		
		String msg="등록실패";
		if(result>0) {
			msg="등록성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", "./list"); 
		
		
		
		return "commons/result";
	}
//	
	@RequestMapping(value ="add",method = RequestMethod.GET)
	public String add() {
		
		
		
		// /WEB-INF/views/ .jsp
		
		return "regions/add";
	}
//	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Integer region_id, Model model) throws Exception{
		
		RegionDTO regionDTO = new RegionDTO();
		//String id = request.getParameter("region_id");
		
		regionDTO.setRegion_id(region_id);
		
		regionDTO = regionService.getDetail(regionDTO);
		
		//request.setAttribute("dto", regionDTO);
		model.addAttribute("dto",regionDTO);
		return "regions/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		ModelAndView mv = new ModelAndView();
		
		List<RegionDTO> ar = regionService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("regions/list");
		
		return mv;
	}
	
}
