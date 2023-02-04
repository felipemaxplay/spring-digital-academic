package br.com.felipemaxplay.digitalacademic.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "da_tuition")
public class Tuition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "tuition_date", nullable = false)
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
