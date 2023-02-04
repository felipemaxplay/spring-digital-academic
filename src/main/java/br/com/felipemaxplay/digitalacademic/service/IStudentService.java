package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;

import java.util.List;

public interface IStudentService {
    Student save(StudentForm form);

    Student getById(Long id);

    List<Student> getAll();

    Student updateById(Long id, StudentForm formUpdate);

    void deleteById(Long id);
}
