
package uk.ac.city.acvt768.uni.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
    
    @Id
    private int Regno;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    
    @ManyToMany
    @JoinTable (
            name="StudentModule",
            joinColumns = @JoinColumn(name="regNo", referencedColumnName="regNo"),
            inverseJoinColumns = @JoinColumn(name= "code", referencedColumnName="code")
    )       
    private Set<Module> modules;

    public Student() {
        modules = new HashSet<>();
    }

    public int getRegno() {
        return Regno;
    }

    public void setRegno(int Regno) {
        this.Regno = Regno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
    

    @Override
    public String toString() {
        return "Student{" + "Regno=" + Regno + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
}
