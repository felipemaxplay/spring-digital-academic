package br.com.felipemaxplay.digitalacademic.repository;

import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TuitionRepository extends JpaRepository<Tuition, Long> {
    List<Tuition> findByStudentNeighborhood(String neighborhood);
}
