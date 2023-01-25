package com.salesken.service;

import java.util.List;

import com.salesken.exception.StudentException;
import com.salesken.model.Semester;
import com.salesken.model.Student;

public interface StudentService {

	public Student addStudentWithAllDetail(Student student) throws StudentException;
	public Student getReportByEmail(String email) throws StudentException;
	public double wholeClassAvg(Integer id) throws StudentException;
	public double subjectWiseavg(String subject) throws StudentException;
	public List<Student> topStudents();
	
	
}
