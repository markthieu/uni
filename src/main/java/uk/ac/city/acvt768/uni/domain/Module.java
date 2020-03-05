
package uk.ac.city.acvt768.uni.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Module {
    
    @Id
    private String code;
    private String title;
    private int credit;
    
    @ManyToOne
    @JoinColumn(name="staffId")
    private Lecturer lecturer;
    
    @ManyToMany(mappedBy="modules")
    private Set<Student> students;

    public Module() {
        students = new HashSet<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    
    @Override
    public String toString() {
        return "Module{" + "code=" + code + ", title=" + title + ", credit=" + credit + ", lecturer=" + lecturer.getLastName()+'}';
    }
    
     
}
