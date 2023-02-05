package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IStudentController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Student> getAll(@RequestParam(value = "birthDate", required = false) String birthDate);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Student create(@NonNull @Valid @RequestBody StudentForm form);

    @GetMapping(path = "/Assessments/{id}")
    @ResponseStatus(HttpStatus.OK)
    List<PhysicalAssessment> getAllAssAssessment(@PathVariable(name = "id") Long id);
}
