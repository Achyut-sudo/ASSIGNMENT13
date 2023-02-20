package org.NRI.controller;

import javax.validation.Valid;

import org.NRI.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String show(Model x)
	{
		x.addAttribute("emp",new Employee());
		return "home";
	}
	@RequestMapping("/userInfo")
	public String userinformation(@Valid @ModelAttribute("emp") Employee emp,BindingResult bs)
	{
		if(bs.hasErrors())
		{
			return "home";
		}
		else
		   return "userInfo";
	}
}