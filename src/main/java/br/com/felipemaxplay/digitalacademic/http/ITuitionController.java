package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import br.com.felipemaxplay.digitalacademic.entity.form.TuitionForm;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface ITuitionController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Tuition> getAllTuition();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Tuition createTuition(@NonNull @Valid @RequestBody TuitionForm form);
}
