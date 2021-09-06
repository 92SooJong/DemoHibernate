package com.soojong.Demo;
import javax.persistence.*;

@Entity
//@Table(name = "table_student") // 테이블 이름 입력, 없으면 Entity 이름, 없으면 클래스이름이 테이블 명이 된다.
public class Student { // POJO

    @Id
    private int student_id;

    @Column(name= "student_name") // DB에 반영될 컬럼명 지정
    private String name;
    @Transient // DB에 반영되지 않음
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

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", grade=" + grade +
                '}';
    }
}
