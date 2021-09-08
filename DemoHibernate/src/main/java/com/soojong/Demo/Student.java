package com.soojong.Demo;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "table_student") // 테이블 이름 입력, 없으면 Entity 이름, 없으면 클래스이름이 테이블 명이 된다.
public class Student { // POJO

    @Id
    private int sid;

    @Column(name= "student_name") // DB에 반영될 컬럼명 지정
    private String name;
    @Transient // DB에 반영되지 않음
    private String addr;
    private int grade;

    // Laptop에 있는 student 필드와 매핑됨을 알려준다.
    // mappedBy를 하지 않으면 중간 테이블이 생성된다.
    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {

        this.laptop = laptop;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

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
                "student_id=" + sid +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", grade=" + grade +
                '}';
    }
}
