package uk.ac.city.acvt768.uni.dao;

import java.util.List;
import uk.ac.city.acvt768.uni.domain.Lecturer;
import uk.ac.city.acvt768.uni.domain.Module;
import uk.ac.city.acvt768.uni.domain.Student;

public interface UniRepository {

    List<Student> findAllStudents();

    List<Module> findAllModules();

    List<Lecturer> findAllLecturers();

    List<Student> findAllStudentsOnModule(String moduleCode);

    int moduleCount();

    void addModule(String moduleCode, String title, int credit, String staffId);

    void removeLecturer(String staffId);
}
