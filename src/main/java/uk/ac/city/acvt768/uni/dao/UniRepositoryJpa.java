
package uk.ac.city.acvt768.uni.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import uk.ac.city.acvt768.uni.domain.Lecturer;
import uk.ac.city.acvt768.uni.domain.Module;
import uk.ac.city.acvt768.uni.domain.Student;

@Stateless
public class UniRepositoryJpa implements UniRepository{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Student> findAllStudents() {
        TypedQuery<Student> query = em.createQuery(
        "SELECT s from Student AS s", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Module> findAllModules() {
       TypedQuery<Module> query = em.createQuery(
       "SELECT m from Module AS m", Module.class);
       return query.getResultList();
    }

    @Override
    public List<Lecturer> findAllLecturers() {
        TypedQuery<Lecturer> query = em.createQuery(
       "SELECT l from Lecturer AS l", Lecturer.class);
       return query.getResultList();
    }

    @Override
    public List<Student> findAllStudentsOnModule(String moduleCode) {
      TypedQuery<Student> query =em.createQuery(
      "SELECT s FROM Student AS s JOIN s.modules m WHERE m.code= :mc",
              Student.class);
      query.setParameter("mc", moduleCode);
      return query.getResultList();
    }

    @Override
    public int moduleCount() {
        Query query = em.createQuery("SELECT COUNT(m) from Module m");
        Long result = (Long) query.getSingleResult();
        return result.intValue();
    }

    @Override
    public void addModule(String moduleCode, String title, int credit, String staffId) {
      Module module = new Module();
      module.setCode(moduleCode);
      module.setTitle(title);
      module.setCredit(credit);
      Lecturer lecturer = em.find(Lecturer.class, staffId);
      module.setLecturer(lecturer);
      em.persist(module);
    }

    @Override
    public void removeLecturer(String staffId) {
       Lecturer lecturer = em.find(Lecturer.class, staffId);
       em.remove(lecturer);
    }
    
    
    
}
