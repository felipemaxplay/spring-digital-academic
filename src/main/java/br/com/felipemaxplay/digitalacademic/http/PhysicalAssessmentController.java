package br.com.felipemaxplay.digitalacademic.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/Assessments")
public class PhysicalAssessmentController implements IPhysicalAssessmentController {
}
