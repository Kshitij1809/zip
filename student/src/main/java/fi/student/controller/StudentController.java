package fi.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.student.entity.Student;
import fi.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model data) {
		
		data.addAttribute("students", service.getAllStudents());
		
		return "students";
	}
	
	@GetMapping("students/add")
	public String newStudent(Model data) {
		
		Student student = new Student();
		data.addAttribute("student", student);
		
		return "newStudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		
		return "redirect:/students";
	}

}
