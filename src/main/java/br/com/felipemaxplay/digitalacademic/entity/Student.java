package br.com.felipemaxplay.digitalacademic.entity;

import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Student(@NonNull String name, @NonNull String cpf, @NonNull String neighborhood, @NonNull LocalDate birthDate,
                   @NonNull List<PhysicalAssessment> assessments) {
        this.name = Objects.requireNonNull(name);
        this.cpf = Objects.requireNonNull(cpf);
        this.neighborhood = Objects.requireNonNull(neighborhood);
        BirthDate = Objects.requireNonNull(birthDate);
        this.assessments = Objects.requireNonNull(assessments);
    }

    public Student(@NonNull Long id, @NonNull String name, @NonNull String cpf, @NonNull String neighborhood,
                   @NonNull LocalDate birthDate, @NonNull List<PhysicalAssessment> assessments) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.cpf = Objects.requireNonNull(cpf);
        this.neighborhood = Objects.requireNonNull(neighborhood);
        BirthDate = Objects.requireNonNull(birthDate);
        this.assessments = Objects.requireNonNull(assessments);
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
