package br.com.felipemaxplay.digitalacademic.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController implements IStudentController {
}
