package br.com.felipemaxplay.digitalacademic.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class StudentForm {
    @NotEmpty
    private String name;
    @NotEmpty
    private String cpf;
    @NotEmpty
    private String neighborhood;
    @NotNull
    private LocalDate birthDate;

    @Deprecated
    public StudentForm() {
    }

    public StudentForm(String name, String cpf, String neighborhood, LocalDate birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.neighborhood = neighborhood;
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        return "StudentForm{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
