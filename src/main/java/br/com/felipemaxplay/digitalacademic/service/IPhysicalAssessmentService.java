package br.com.felipemaxplay.digitalacademic.service;

import br.com.felipemaxplay.digitalacademic.entity.PhysicalAssessment;
import br.com.felipemaxplay.digitalacademic.entity.form.PhysicalAssessmentForm;

import java.util.List;

public interface IPhysicalAssessmentService {
    PhysicalAssessment save(PhysicalAssessmentForm form);

    PhysicalAssessment getById(Long id);

    List<PhysicalAssessment> getAll();

    PhysicalAssessment updateById(Long id, PhysicalAssessmentForm formUpdate);

    void deleteById(Long id);
}
