package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.form.PhysicalAssessmentForm;
import br.com.felipemaxplay.digitalacademic.service.PhysicalAssessmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/Assessments")
public class PhysicalAssessmentController implements IPhysicalAssessmentController {
    private final PhysicalAssessmentService service;

    public PhysicalAssessmentController(PhysicalAssessmentService service) {
        this.service = service;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PhysicalAssessment create(@NonNull @Valid @RequestBody PhysicalAssessmentForm form) {
        return service.save(form);
    }
}
