package fi.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.student.entity.Student;
import fi.student.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {

		return repository.save(student);

	}

}
