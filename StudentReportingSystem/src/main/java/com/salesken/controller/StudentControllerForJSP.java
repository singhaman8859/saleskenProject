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
	
//	@RequestMapping(value = "add-marks", method = RequestMethod.POST)
//	public String editMarks(HttpServletRequest request) {
//		Integer roll=Integer.parseInt(request.getParameter("rollNumber"));
//		
//		Semester semester=new Semester(Integer.parseInt(request.getParameter("id")),Integer.parseInt(request.getParameter("english")), 
//											Integer.parseInt(request.getParameter("maths")) , Integer.parseInt(request.getParameter("science")));
//		
//		sService.setMarks(roll, semester);
//		
//		return "home.jsp";
//	}
//	
//	
//	@RequestMapping("/topstudents")
//	public ModelAndView topTwoStudents() {
//		List<Student> list=sService.topTwoStudents();
//		ModelAndView model=new ModelAndView();
//		model.addObject("list",list);
//		model.setViewName("TopStudent.jsp");
//		
//		return model;
//	}
//	
//	@RequestMapping(value = "choose-semester", method = RequestMethod.POST)
//	public ModelAndView averageReport(HttpServletRequest request) {
//		Integer semester=Integer.parseInt(request.getParameter("semester"));
//		
//		MarksReportDTO report=sService.averageReports(semester);
//		
//		List<MarksReportDTO>list=new ArrayList<>();
//		list.add(report);
//		
//		ModelAndView model=new ModelAndView();
//		model.addObject("list",list);
//		model.setViewName("averageReport.jsp");
//		
//		return model;
//	}
	
	
	
}
