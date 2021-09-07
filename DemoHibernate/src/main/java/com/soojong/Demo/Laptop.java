package com.soojong.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String laptop_name;

    @ManyToOne
    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }
}
