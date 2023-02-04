package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;
import br.com.felipemaxplay.digitalacademic.repository.StudentRepository;
import org.springframework.stereotype.Service;

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
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student updateById(Long id, StudentForm formUpdate) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
