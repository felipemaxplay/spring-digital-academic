package br.com.felipemaxplay.digitalacademic.entity;

import java.time.LocalDate;

public class Tuition {
    private Long id;
    private Student student;
    private LocalDate tuitionDate = LocalDate.now();

    @Deprecated
    public Tuition() {
    }

    public Tuition(Student student, LocalDate tuitionDate) {
        this.student = student;
        this.tuitionDate = tuitionDate;
    }

    public Tuition(Long id, Student student, LocalDate tuitionDate) {
        this.id = id;
        this.student = student;
        this.tuitionDate = tuitionDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getTuitionDate() {
        return tuitionDate;
    }

    public void setTuitionDate(LocalDate tuitionDate) {
        this.tuitionDate = tuitionDate;
    }

    @Override
    public String toString() {
        return "Tuition{" +
                "id=" + id +
                ", student=" + student +
                ", tuitionDate=" + tuitionDate +
                '}';
    }
}
