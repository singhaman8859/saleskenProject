//package com.salesken.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.salesken.exception.StudentException;
//import com.salesken.model.Student;
//import com.salesken.service.StudentService;
//
//@Controller
//public class StudentController {
//	
//	@Autowired
//	private StudentService sservice;
//	
//	@RequestMapping("/")
//	public String homePage() {
//		return "homeapp.jsp";
//	}
//	
//	
//	@PostMapping("/student")
//	public ResponseEntity<Student> addStudentHandler(@RequestBody Student student) throws StudentException{
//		
//		return new ResponseEntity<Student>(sservice.addStudentWithAllDetail(student), HttpStatus.OK);
//	}
//	
//	@GetMapping("/studentReport/{email}")
//    public ResponseEntity<Student> seeStudentReportHandler(@RequestParam String email) throws StudentException{
//		
//		return new ResponseEntity<Student>(sservice.getReportByEmail(email), HttpStatus.OK);
//	}
//	
//	 @GetMapping("/student/{enterSemester}")
//	 public ResponseEntity<Double> seeAvgPercentWholeClass(@RequestParam Integer id) throws StudentException{
//			
//			return new ResponseEntity<Double>(sservice.wholeClassAvg(id), HttpStatus.OK);
//	}
//	 
//	 @GetMapping("/students/{enterSubject}")
//	 public ResponseEntity<Double> seeAvgPerOfSubject(@RequestParam String subject) throws StudentException{
//		 
//		 return new ResponseEntity<Double>(sservice.subjectWiseavg(subject), HttpStatus.OK);
//			
//	}
//	
//	 @GetMapping("/top2ConstitentStudent")
//	 public ResponseEntity<List<Student>> top2ConstitentStudent(){
//		 return new ResponseEntity<List<Student>>(sservice.topStudents(), HttpStatus.OK);
//			
//	}
//	 
//	
//	
//}
