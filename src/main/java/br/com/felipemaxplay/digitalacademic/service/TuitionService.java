package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import br.com.felipemaxplay.digitalacademic.entity.form.TuitionForm;
import br.com.felipemaxplay.digitalacademic.repository.StudentRepository;
import br.com.felipemaxplay.digitalacademic.repository.TuitionRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuitionService implements ITuitionService {
    private final TuitionRepository repository;
    private final StudentRepository studentRepository;

    public TuitionService(TuitionRepository repository, StudentRepository studentRepository) {
        this.repository = repository;
        this.studentRepository = studentRepository;
    }

    @Override
    public Tuition save(TuitionForm form) {
        Student studentRecovery = studentRepository.findById(form.getStudentId()).orElseThrow(() -> new NoResultException(
                String.format("Student with id %d not found", form.getStudentId())
        ));

        Tuition persist = new Tuition(studentRecovery);

        return repository.save(persist);
    }

    @Override
    public Tuition getById(Long id) {
        return null;
    }

    @Override
    public List<Tuition> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }
}
