package com.store.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class HomeController {
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		 ModelAndView mv = new  ModelAndView("/index");
		 mv.addObject("msg", "Welcome to shopping Cart");
		 return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView loginpage()
	{
		  ModelAndView mv = new ModelAndView("/index");
		  return mv;
	}

}
