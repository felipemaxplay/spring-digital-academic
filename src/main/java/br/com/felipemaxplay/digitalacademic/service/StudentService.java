package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.config.utils.JavaTimeUtils;
import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;
import br.com.felipemaxplay.digitalacademic.repository.StudentRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(StudentForm form) {
        Student studentPersist = new Student(form.getName(), form.getCpf(), form.getNeighborhood(), form.getBirthDate());
        return repository.save(studentPersist);
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll(String birthDate) {
        if(birthDate == null) {
            return repository.findAll();
        } else {
            LocalDate date = LocalDate.parse(birthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByBirthDate(date);
        }
    }

    @Override
    public Student updateById(Long id, StudentForm formUpdate) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<PhysicalAssessment> getAllAssessmentsById(Long id) {
        Student student = repository.findById(id).orElseThrow(() -> new NoResultException(String.format("Student with id %d not found", id)));
        return student.getAssessments();
    }
}
