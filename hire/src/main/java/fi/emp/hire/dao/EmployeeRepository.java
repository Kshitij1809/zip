package fi.emp.hire.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import fi.emp.hire.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
