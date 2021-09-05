package com.soojong.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Student student = new Student();
        student.setStudent_id(1);
        student.setName("Soojong");
        student.setAddr("Seoul");
        student.setGrade(3);


        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();


    }
}
