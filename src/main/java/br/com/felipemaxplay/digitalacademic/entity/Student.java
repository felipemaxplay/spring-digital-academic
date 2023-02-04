package br.com.felipemaxplay.digitalacademic.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String cpf;
    private  String neighborhood;
    private LocalDate BirthDate;
    private List<PhysicalAssessment> assessments = new ArrayList<>();

    @Deprecated
    public Student() {
    }

    public Student(String name, String cpf, String neighborhood, LocalDate birthDate, List<PhysicalAssessment> assessments) {
        this.name = name;
        this.cpf = cpf;
        this.neighborhood = neighborhood;
        BirthDate = birthDate;
        this.assessments = assessments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public List<PhysicalAssessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<PhysicalAssessment> assessments) {
        this.assessments = assessments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", BirthDate=" + BirthDate +
                ", assessments=" + assessments +
                '}';
    }
}
