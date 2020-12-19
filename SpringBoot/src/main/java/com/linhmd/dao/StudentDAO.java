package com.linhmd.dao;

import com.linhmd.dto.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeSet;

@Service
@Qualifier("fakeData")
public class StudentDAO implements StudentDAOInterface{
	private static TreeSet<Student> STUDENTS;
	static {
		STUDENTS = new TreeSet<Student>(){
			{
				add(new Student(1, "linh", "CEA101"));
				add(new Student(2, "hoang", "PRJ321"));
				add(new Student(3, "han", "PRJ311"));
				add(new Student(4, "nam", "SSG101"));
			}
		};
	}


	public Collection<Student> getAllStudents() {
		return STUDENTS;
	}
}
