package fi.emp.hire.service;


import org.springframework.stereotype.Service;

import fi.emp.hire.dao.EmployeeRepository;
import fi.emp.hire.model.Employee;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

