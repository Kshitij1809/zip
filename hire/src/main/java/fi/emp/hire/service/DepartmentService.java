package fi.emp.hire.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.emp.hire.dao.DepartmentRepository;
import fi.emp.hire.model.Department;

@Service
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}
}
