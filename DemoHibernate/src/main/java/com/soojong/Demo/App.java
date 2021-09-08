package com.soojong.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLaptop_name("dell");


        // insert할 데이터를 셋팅한다.
        Student student = new Student();
        laptop.setStudent(student);

        List<Laptop> laptopArrayList = new ArrayList<>();
        laptopArrayList.add(laptop);

        //StudentName studentName = new StudentName();
        student.setSid(2);
        student.setName("Soojong");
        student.setAddr("Seoul");
        student.setGrade(3);
        student.setLaptop(laptopArrayList);



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
        session.save(laptop);
        session.save(student);


        tx.commit();


    }
}
