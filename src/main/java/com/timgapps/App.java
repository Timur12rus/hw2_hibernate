package com.timgapps;

import com.sun.xml.bind.v2.TODO;
import com.timgapps.model.Director;
import com.timgapps.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Director.class).addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//             создадим директора и школу
//            Director director1 = new Director("Mary", 23);
//            School school1 = new School(director1, "School1");
//            School school2 = new School(director1, "School2");
//            director1.setSchool(school1);
//            director1.setSchool(school2);
//
//            Director director2 = new Director("Bob", 32);
//            School school2 = new School(director2, "Wonderland");
//            director2.setSchool(school2);
//
//            Director director3 = new Director("Elly", 27);
//            School school3 = new School(director3, "FairyTail");
//            director3.setSchool(school3);
//
//            session.save(director1);
//            session.save(director2);
//            session.save(director3);

            // Получим школу, а потом получим её директора
//            School school = session.get(School.class, 9);
//            System.out.println(school.getSchoolName());


//             Получим директора, а потом получим школу
//            Director director = session.get(Director.class, 10);
//            School school = director.getSchool();
//            System.out.println(school.getSchoolName());

            // Сменим директора у какой-нибудь школы
            //TODO Fix Bug
//            Director director = session.get(Director.class, 10);
//            School school = new School();
//            school.setSchoolName("MY");
//            director.setSchool(school);
//            school.setDirector(director);
//            session.save(director);
//            session.save(school);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
