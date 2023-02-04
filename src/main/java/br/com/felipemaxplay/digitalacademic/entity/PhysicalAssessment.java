package br.com.felipemaxplay.digitalacademic.entity;

import java.time.LocalDate;

public class PhysicalAssessment {
    private Long id;
    private Student student;
    private LocalDate assessmentDate = LocalDate.now();
    private double weight;
    private double height;

    @Deprecated
    public PhysicalAssessment() {
    }

    public PhysicalAssessment(Student student, LocalDate assessmentDate, double weight, double height) {
        this.student = student;
        this.assessmentDate = assessmentDate;
        this.weight = weight;
        this.height = height;
    }

    public PhysicalAssessment(Long id, Student student, LocalDate assessmentDate, double weight, double height) {
        this.id = id;
        this.student = student;
        this.assessmentDate = assessmentDate;
        this.weight = weight;
        this.height = height;
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
