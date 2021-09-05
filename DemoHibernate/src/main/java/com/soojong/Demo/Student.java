package com.soojong.Demo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student { // POJO

    @Id
    private int student_id;
    private String name;
    private String addr;
    private int grade;


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
