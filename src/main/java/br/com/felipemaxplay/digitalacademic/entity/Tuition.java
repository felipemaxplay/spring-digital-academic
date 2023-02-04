package br.com.felipemaxplay.digitalacademic.entity;

import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Objects;

public class Tuition {
    private Long id;
    private Student student;
    private LocalDate tuitionDate = LocalDate.now();

    @Deprecated
    public Tuition() {
    }

    public Tuition(@NonNull Student student, @NonNull LocalDate tuitionDate) {
        this.student = Objects.requireNonNull(student);
        this.tuitionDate = Objects.requireNonNull(tuitionDate);
    }

    public Tuition(@NonNull Long id, @NonNull Student student, @NonNull LocalDate tuitionDate) {
        this.id = Objects.requireNonNull(id);
        this.student = Objects.requireNonNull(student);
        this.tuitionDate = Objects.requireNonNull(tuitionDate);
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
