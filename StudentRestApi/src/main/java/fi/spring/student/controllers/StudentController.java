package fi.spring.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fi.spring.student.entity.Student;
import fi.spring.student.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServices service;

	@GetMapping("/list")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

	@GetMapping("/{rollno}")
	public Student getStudent(@PathVariable int rollno) {
		return service.getStudent(rollno);
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Student saveNewStudent(@RequestBody Student student) {
		return service.saveNewStudent(student);
	}

	@PutMapping("/update/{rollno}")
	public Student updateStudent(@PathVariable int rollno, @RequestBody Student student) {
		return service.updateStudent(rollno, student);
	}

	@DeleteMapping("/delete/{rollno}")
	public String deleteStudent(@PathVariable int rollno) {
		return service.deleteStudent(rollno);
	}

}
