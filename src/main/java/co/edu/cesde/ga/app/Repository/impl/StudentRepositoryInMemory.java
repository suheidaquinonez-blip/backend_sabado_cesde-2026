package co.edu.cesde.ga.app.Repository.impl;

import co.edu.cesde.ga.app.Repository.StundetRepository;
import co.edu.cesdega.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StundetRepository {

    private List<Student> students;
    private long nextStudentId;

    public StudentRepositoryInMemory() {
        this.students = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student create(Student student) {
        if (student == null) {
            return null;
        }
        if (findByDocumentNumber(student.getDocumentNumber()) != null) {
            return null;
        }
        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean delete(long studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return false;
        }
        students.remove(student);
        return true;
    }

    @Override
    public boolean update(Student studentUpdate) {
        if (studentUpdate == null) {
            return false;
        }
        Student existing = findById(studentUpdate.getStudentId());
        if (existing == null) {
            return false;
        }
        students.set(students.indexOf(existing), studentUpdate);
        return true;
    }

    @Override
    public Student findById(long studentId) {
        if (studentId < 0L) {
            return null;
        }
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student firdByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return null;
        }
        for (Student student : students) {
            if (student.getDocumentNumber().equals(documentNumber)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean existsById(long studentId) {
        if (studentId < 0L) {
            return false;
        }
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }
}