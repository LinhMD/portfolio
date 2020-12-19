package com.linhmd.service;

import com.linhmd.dao.StudentDAOInterface;
import com.linhmd.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
	@Autowired
	@Qualifier("fakeData")
	private StudentDAOInterface studentDAO;
	public Collection<Student> getAll(){
		return this.studentDAO.getAllStudents();
	}
}
