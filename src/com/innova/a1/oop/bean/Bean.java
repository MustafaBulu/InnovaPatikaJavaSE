package com.innova.a1.oop.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Bean implements Serializable {
    private int studentId;
    private String studentName;
    private String studentSurName;
    private Date createdDate;

    //parametresiz constructor

    public Bean() {

        this.studentName="Mustafa";
        createdDate=new Date(System.currentTimeMillis());



    }


    //parametreli constructor

    public Bean(String studentName,String studentSurName) {

        this.studentName=studentName;
        this.studentSurName=studentSurName;


    }



    //toString

    @Override
    public String toString() {
        return "Bean{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSurName='" + studentSurName + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }


    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return studentId == bean.studentId && studentName.equals(bean.studentName) && studentSurName.equals(bean.studentSurName) && createdDate.equals(bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSurName, createdDate);
    }


    //method

    public void deneme(){
        System.out.println(this.studentName+""+this.studentSurName);


    }
    //getter and setter


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurName() {
        return studentSurName;
    }

    public void setStudentSurName(String studentSurName) {
        this.studentSurName = studentSurName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
