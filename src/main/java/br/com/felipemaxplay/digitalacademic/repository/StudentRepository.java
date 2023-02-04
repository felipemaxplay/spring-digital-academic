package br.com.felipemaxplay.digitalacademic.repository;

import br.com.felipemaxplay.digitalacademic.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
