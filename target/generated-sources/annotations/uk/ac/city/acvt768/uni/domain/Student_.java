package uk.ac.city.acvt768.uni.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acvt768.uni.domain.Module;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-15T22:58:44")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> firstName;
    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, Integer> Regno;
    public static volatile SingularAttribute<Student, Date> dateOfBirth;
    public static volatile SetAttribute<Student, Module> modules;

}