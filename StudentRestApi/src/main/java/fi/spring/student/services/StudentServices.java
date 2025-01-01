package fi.spring.student.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.spring.student.entity.Student;

@Service
public interface StudentServices {

	public List<Student> getAllStudent();

	public Student getStudent(int rollno);

	public Student saveNewStudent(Student student);

	public Student updateStudent(int rollno, Student student);

	public String deleteStudent(int rollno);

}
