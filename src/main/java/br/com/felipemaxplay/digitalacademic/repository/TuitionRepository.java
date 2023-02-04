package br.com.felipemaxplay.digitalacademic.repository;

import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuitionRepository extends JpaRepository<Tuition, Long> {
}
