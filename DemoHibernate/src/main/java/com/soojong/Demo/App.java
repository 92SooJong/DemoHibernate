package com.soojong.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;


public class App {

    public static void main(String[] args) {

        // insert할 데이터를 셋팅한다.
        Student student = new Student();
        StudentName studentName = new StudentName();
        student.setStudent_id(2);
        student.setName("Soojong");
        student.setAddr("Seoul");
        student.setGrade(3);

        Laptop laptop = new Laptop();
        laptop.setLaptop_id(101);
        laptop.setLaptop_name("dell");


        // configure()메소드에 아무값도 입력하지 않으면 hibernate.cfg.xml을 default로 읽어온다
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);

        ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        // SessionFactory는 Database와 연결을 관리한다. DB 1개당 SessionFactory 1개가 필요하다
        SessionFactory sf = con.buildSessionFactory(service);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // student 테이블의 student_id가 1인 데이터 가져오기
        //Student s = session.get(Student.class, 1);
        //System.out.println(s);

        //insert를 수행한다.
        session.save(student);
        session.save(laptop);

        tx.commit();


    }
}
