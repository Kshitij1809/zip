package fi.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.student.entity.Student;

@Service
public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
}
