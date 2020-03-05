package uk.ac.city.acvt768.uni.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acvt768.uni.domain.Module;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-15T22:58:44")
@StaticMetamodel(Lecturer.class)
public class Lecturer_ { 

    public static volatile SingularAttribute<Lecturer, String> firstName;
    public static volatile SingularAttribute<Lecturer, String> lastName;
    public static volatile SingularAttribute<Lecturer, Date> dateOfBirth;
    public static volatile SingularAttribute<Lecturer, String> staffId;
    public static volatile SingularAttribute<Lecturer, String> room;
    public static volatile SetAttribute<Lecturer, Module> modules;

}