package uk.ac.city.acvt768.uni.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acvt768.uni.domain.Lecturer;
import uk.ac.city.acvt768.uni.domain.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-15T22:58:44")
@StaticMetamodel(Module.class)
public class Module_ { 

    public static volatile SingularAttribute<Module, String> code;
    public static volatile SingularAttribute<Module, Lecturer> lecturer;
    public static volatile SetAttribute<Module, Student> students;
    public static volatile SingularAttribute<Module, String> title;
    public static volatile SingularAttribute<Module, Integer> credit;

}