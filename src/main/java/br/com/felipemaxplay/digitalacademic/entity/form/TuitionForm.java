package br.com.felipemaxplay.digitalacademic.entity.form;

import jakarta.validation.constraints.NotNull;

public class TuitionForm {
    @NotNull
    private long studentId;

    public TuitionForm(long studentId) {
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "TuitionForm{" +
                "studentId=" + studentId +
                '}';
    }
}
