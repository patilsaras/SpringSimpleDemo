
package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.bean.Student;

import com.service.StudentService;


@Controller

public class StudentController {
	@Autowired
	StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@RequestMapping("/student")
	   public ModelAndView showCustomer()
	{
	      return new ModelAndView("student", "command", new Student());
	   }
	
	@RequestMapping("/search")
	   public ModelAndView search() 
	{
	      return new ModelAndView("search", "command", new Student());
	   }
	@RequestMapping(value ="/view", method = RequestMethod.POST)
	   public ModelAndView view(@RequestParam("id") int studid)
	{
		Student stud =studentService.view(studid);
	
		 return new ModelAndView("viewstud","command",stud);
		
	}	
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	   public ModelAndView addstudent(@ModelAttribute("student")Student student, 
			   BindingResult result) 
	{
		 
		if (student != null) 
		{
			studentService.insertData(student);
		
		   String message="student registration is successful.";
	       return new ModelAndView("success", "message", message);
	   }
		else
		{
			String message="student registration is not successful.";
		       return new ModelAndView("success", "message", message);
		}
	}

	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	  public ModelAndView updatestudent(@ModelAttribute("student")Student student, 
			   BindingResult result) 
	{
		 
		if (student != null)  
			studentService.update(student);
		
			String message="student updated successful.";
	       return new ModelAndView("success", "message", message);
	}
	
	@RequestMapping(value ="/delete", method=RequestMethod.GET)
	
	   public ModelAndView search1()
		{
	      return new ModelAndView("search1", "command", new Student());
	  }
	
	@RequestMapping(value ="/show", method = RequestMethod.POST)
	   public ModelAndView view1(@RequestParam("id") int studid)
	{
		System.out.println(studid);
		Student stud =studentService.delete(studid);
	
	      return new ModelAndView("viewstud1", "command", stud);
		
	}

	@RequestMapping(value ="/delete1", method = RequestMethod.POST)
	  public ModelAndView delete(@ModelAttribute("student")Student student, 
			   BindingResult result) {
		 
		if (student != null)  
			studentService.delete1(student);
		
			String message="Student deleted successful.";
	       return new ModelAndView("success", "message", message);
	   }
	
	@RequestMapping(value ="/update", method=RequestMethod.GET)
	
	   public ModelAndView search2()
		{
	      return new ModelAndView("search2", "command", new Student());
	     }
	}
	   


