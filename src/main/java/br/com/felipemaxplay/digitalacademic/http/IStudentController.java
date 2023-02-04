package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface IStudentController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Student> getAll();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Student create(@NonNull @Valid @RequestBody StudentForm form);
}
