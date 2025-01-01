package fi.spring.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.spring.student.entity.Student;
import fi.spring.student.repository.StudentRepository;

@Component 
public class StudentServicesImp implements StudentServices {

	@Autowired
	StudentRepository repo;

	public List<Student> getAllStudent() {
		System.out.println("/students url hitted");
		if (repo.findAll().isEmpty()) {
			return null;
		} else {
			List<Student> list = repo.findAll();
			return list;
		}
	}

	public Student getStudent(int rollno) {
		System.out.println("/student url hitted");
		if (repo.findById(rollno).isPresent())
			return repo.findById(rollno).get();
		else
			return null;
	}

	public Student saveNewStudent(Student student) {
		int maxrollno = repo.findMaxRollNo();
		System.out.println(maxrollno);
		student.setRollNo(maxrollno + 1);
		return repo.save(student);
	}

	public Student updateStudent(int rollno, Student student) {

		if (repo.findById(rollno).isPresent()) {
			student.setRollNo(rollno);
			repo.save(student);
			return student;
		}
		return null;
	}

	public String deleteStudent(int rollno) {
		if (repo.findById(rollno).isPresent()) {
			repo.deleteById(rollno);
			return "Deleted " + rollno;
		} else {
			return "No such student exits";
		}
	}

}
