package fi.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
