package br.com.felipemaxplay.digitalacademic.http;

import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import br.com.felipemaxplay.digitalacademic.entity.form.TuitionForm;
import br.com.felipemaxplay.digitalacademic.service.TuitionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tuition")
public class TuitionController implements ITuitionController {
    private final TuitionService tuitionService;

    public TuitionController(TuitionService tuitionService) {
        this.tuitionService = tuitionService;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tuition> getAllTuition(@RequestParam(name = "neighborhood", required = false) String neighborhood) {
        return tuitionService.getAll(neighborhood);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tuition createTuition(@NonNull @Valid @RequestBody TuitionForm form) {
        return tuitionService.save(form);
    }
}
