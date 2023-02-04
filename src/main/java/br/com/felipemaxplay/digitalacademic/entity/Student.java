package br.com.felipemaxplay.digitalacademic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "da_students")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "cpf", unique = true, nullable = false, length = 14)
    private String cpf;

    @Column(name = "neighborhood", nullable = false, length = 60)
    private  String neighborhood;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<PhysicalAssessment> assessments = new ArrayList<>();

    @Deprecated
    public Student() {
    }

    public Student(@NonNull String name, @NonNull String cpf, @NonNull String neighborhood, @NonNull LocalDate birthDate,
                   @NonNull List<PhysicalAssessment> assessments) {
        this.name = Objects.requireNonNull(name);
        this.cpf = Objects.requireNonNull(cpf);
        this.neighborhood = Objects.requireNonNull(neighborhood);
        this.birthDate = Objects.requireNonNull(birthDate);
        this.assessments = Objects.requireNonNull(assessments);
    }

    public Student(@NonNull Long id, @NonNull String name, @NonNull String cpf, @NonNull String neighborhood,
                   @NonNull LocalDate birthDate, @NonNull List<PhysicalAssessment> assessments) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.cpf = Objects.requireNonNull(cpf);
        this.neighborhood = Objects.requireNonNull(neighborhood);
        this.birthDate = Objects.requireNonNull(birthDate);
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
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
                ", birthDate=" + birthDate +
                ", assessments=" + assessments +
                '}';
    }
}
