package co.edu.cesde.ga.app.Repository;

import co.edu.cesdega.models.Teacher;
import java.util.List;

public interface TeacherRepository {

    Teacher create(Teacher teacher);

    boolean delete(long teacherId);

    boolean update(Teacher teacherUpdate);

    Teacher findById(long teacherId);

    List<Teacher> findAll();

    boolean existsByDocumentNumber(String documentNumber);
    Teacher findByDocumentNumber(String documentNumber);


}