package com.example.demo.demo.controller;

import com.example.demo.demo.entity.ProductDetailReEntity;
import com.example.demo.demo.entity.ProductListReEntity;
import com.example.demo.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestController
@Controller
//@CrossOrigin("*")
public class IndexController extends BaseController {

	@Autowired
	private ProductService productService;
 
//	@Value("${spring.profiles.active}")
//	private String active;


	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("首页");
		List<ProductListReEntity> list = productService.last3();

		ModelAndView mv = new ModelAndView();
		mv.addObject("lists", list);
		mv.setViewName("index"); //设置视图名
		return mv;
	}
	
	@RequestMapping(value = "/list.html")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
		List<ProductListReEntity> list  = productService.list();

		// 创建并返回 ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("lists", list); // 设置返回的数据
        mv.setViewName("list"); //设置视图名
        return mv;
	}
	
	@RequestMapping(value = "/detail.html")
	public ModelAndView detail(HttpServletRequest request, HttpServletResponse response) {
		Integer id = 1;
		if (request.getParameter("id") != null ) {
			id = Integer.valueOf(request.getParameter("id"));
		}
		
		ProductDetailReEntity data  = productService.detail(id);
		
		// 创建并返回 ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("data", data); // 设置返回的数据
        mv.setViewName("detail"); //设置视图名
		return mv; 

	}

	
}
