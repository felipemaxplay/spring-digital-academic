package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.PhysicalAssessmentForm;
import br.com.felipemaxplay.digitalacademic.repository.PhysicalAssessmentRepository;
import br.com.felipemaxplay.digitalacademic.repository.StudentRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentService implements IPhysicalAssessmentService {
    private final PhysicalAssessmentRepository repository;
    private final StudentRepository studentRepository;

    public PhysicalAssessmentService(PhysicalAssessmentRepository repository, StudentRepository studentRepository) {
        this.repository = repository;
        this.studentRepository = studentRepository;
    }

    @Override
    public PhysicalAssessment save(PhysicalAssessmentForm form) {
        Student studentRecovery = studentRepository.findById(form.getStudentId()).orElseThrow(() -> new NoResultException(
                String.format("Student with id %d not found", form.getStudentId())
        ));

        PhysicalAssessment persist = new PhysicalAssessment(studentRecovery, form.getWeight(), form.getHeight());

        return repository.save(persist);
    }

    @Override
    public PhysicalAssessment getById(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAll() {
        return null;
    }

    @Override
    public PhysicalAssessment updateById(Long id, PhysicalAssessmentForm formUpdate) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
