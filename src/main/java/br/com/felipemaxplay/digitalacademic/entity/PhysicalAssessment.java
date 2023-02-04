package br.com.felipemaxplay.digitalacademic.entity;

import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Objects;

public class PhysicalAssessment {
    private Long id;

    private Student student;
    private LocalDate assessmentDate = LocalDate.now();
    private double weight;
    private double height;

    @Deprecated
    public PhysicalAssessment() {
    }

    public PhysicalAssessment(@NonNull Student student, @NonNull LocalDate assessmentDate, @NonNull double weight,
                              @NonNull double height) {
        this.student = Objects.requireNonNull(student);
        this.assessmentDate = Objects.requireNonNull(assessmentDate);
        this.weight = Objects.requireNonNull(weight);
        this.height = Objects.requireNonNull(height);
    }

    public PhysicalAssessment(@NonNull Long id, @NonNull Student student, @NonNull LocalDate assessmentDate,
                              @NonNull double weight, @NonNull double height) {
        this.id = Objects.requireNonNull(id);
        this.student = Objects.requireNonNull(student);
        this.assessmentDate = Objects.requireNonNull(assessmentDate);
        this.weight = Objects.requireNonNull(weight);
        this.height = Objects.requireNonNull(height);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PhysicalAssessment{" +
                "id=" + id +
                ", student=" + student +
                ", assessmentDate=" + assessmentDate +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
