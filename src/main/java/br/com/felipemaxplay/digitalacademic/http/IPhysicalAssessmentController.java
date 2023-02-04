package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.form.PhysicalAssessmentForm;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface IPhysicalAssessmentController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PhysicalAssessment create(@NonNull @Valid @RequestBody PhysicalAssessmentForm form);
}
