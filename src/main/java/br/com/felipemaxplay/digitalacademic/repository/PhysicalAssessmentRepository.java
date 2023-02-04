package br.com.felipemaxplay.digitalacademic.repository;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {
}
