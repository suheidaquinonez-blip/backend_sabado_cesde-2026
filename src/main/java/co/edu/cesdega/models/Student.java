package co.edu.cesdega.models;

import java.time.LocalDate;

public class Student extends Person {

    private LocalDate birthDate;
    private Long studentId;

    public Student(String code, String documentNumber, String firstName, String lastName, Boolean status, LocalDate birthDate, Long studentId) {
        super();
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public Student() {

    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "student =" + "Student{" +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", status=" + getStatus() +
                ", birthDate=" + birthDate +
                ", studentId=" + studentId +
                '}';
    }
}