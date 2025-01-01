package fi.emp.hire.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import fi.emp.hire.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
