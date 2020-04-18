package com.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoramlMvcController {

	@RequestMapping("/")
	public String getFirstPage() throws Exception{
			System.out.println("INSIDE NormalMVC CONtroller"+9/0);
		return "index1";
	}

	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleAllException(NullPointerException ex) {

		System.out.println("@ExceptionHandler");
		ModelAndView model = new ModelAndView("generic_error");
		model.addObject("errMsg", "tyeeeeeeeeeeeeeeeeeeeees");

		return model;

	}
}
