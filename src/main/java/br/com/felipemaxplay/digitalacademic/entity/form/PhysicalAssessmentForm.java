package br.com.felipemaxplay.digitalacademic.entity.form;

import jakarta.validation.constraints.NotNull;

public class PhysicalAssessmentForm {
    @NotNull
    private Long studentId;
    @NotNull
    private double weight;

    @NotNull
    private double height;

    public PhysicalAssessmentForm(Long studentId, double weight, double height) {
        this.studentId = studentId;
        this.weight = weight;
        this.height = height;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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
        return "PhysicalAssessmentForm{" +
                "studentId=" + studentId +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
