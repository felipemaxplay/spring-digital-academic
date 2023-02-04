package br.com.felipemaxplay.digitalacademic.entity.form;

public class PhysicalAssessmentUpdateForm {
    private double weight;
    private double height;

    public PhysicalAssessmentUpdateForm(double weight, double height) {
        this.weight = weight;
        this.height = height;
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
        return "PhysicalAssessmentUpdateForm{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
