package co.edu.cesde.ga.app.Repository;
import co.edu.cesdega.models.Student;

import java.util.List;

public interface StundetRepository {

    Student create (Student student);

     boolean delete(long studentId);
     boolean update(Student studentUpdate);
     Student findById(long studentId);
     Student firdByDocumentNumber (String documentNumber);

 Student findByDocumentNumber(String documentNumber);

 List<Student> findAll();
     boolean existsById(long studentId);

}
