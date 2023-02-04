package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.Tuition;
import br.com.felipemaxplay.digitalacademic.entity.form.TuitionForm;

import java.util.List;

public interface ITuitionService {
    Tuition save(TuitionForm form);

    Tuition getById(Long id);

    List<Tuition> getAll();

    void deleteById(Long id);
}
