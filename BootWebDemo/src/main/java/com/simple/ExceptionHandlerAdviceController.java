package com.simple;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdviceController {
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		System.out.println("@ExceptionHandler"+ex.getMessage());
		ModelAndView model = new ModelAndView("generic_error");
		model.addObject("errMsg", "FATLLEEEEEEE ki shivayche");

		return model;

	}}
