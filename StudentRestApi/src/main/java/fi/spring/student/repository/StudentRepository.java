package fi.spring.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fi.spring.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "SELECT MAX(roll_no) AS maxRollNo FROM student", nativeQuery = true)
	Integer findMaxRollNo();

}
