package br.com.felipemaxplay.digitalacademic.entity.form;

import java.time.LocalDate;

public class StudentUpdateForm {
    private String name;
    private String neighborhood;
    private LocalDate birthDate;

    public StudentUpdateForm(String name, String neighborhood, LocalDate birthDate) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "StudentUpdateForm{" +
                "name='" + name + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
