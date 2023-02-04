package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.Student;
import br.com.felipemaxplay.digitalacademic.entity.form.StudentForm;
import br.com.felipemaxplay.digitalacademic.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController implements IStudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@NonNull @Valid @RequestBody StudentForm form) {
        return studentService.save(form);
    }

    @Override
    @GetMapping(path = "/Assessments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<PhysicalAssessment> getAllAssAssessment(@PathVariable(name = "id") Long id) {
        return studentService.getAllAssessmentsById(id);
    }
}
