package com.linhmd.controller;

import com.linhmd.dto.Student;
import com.linhmd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudent(){
		return studentService.getAll();

	}
}










