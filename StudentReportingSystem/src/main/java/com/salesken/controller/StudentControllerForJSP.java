package com.salesken.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.service.StudentService;

@Controller
public class StudentControllerForJSP {


	@Autowired
	private StudentService sService;
	
	@RequestMapping("/")
	private String homePage() {
		return "homeapp.jsp";
	}
	
	
	@RequestMapping(value = "add-student", method = RequestMethod.POST)
	public String saveStudent(HttpServletRequest request) throws StudentException {
								
		
		Student student = new Student();
		student.setStudentName(request.getParameter("name"));
		student.setEmail(request.getParameter("email"));
		student.setAddress(request.getParameter("address"));
		sService.addStudentWithAllDetail(student);
		
		return "homeapp.jsp";
	}
	

	
	
	
}
