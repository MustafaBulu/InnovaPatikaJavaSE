package com.innova.a1.oop.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data //getter and setter toString hashcode()
@NoArgsConstructor
@AllArgsConstructor
public class Bean_Lombok implements Serializable {
    private int studentId;
    private String studentName;
    private String studentSurName;
    private Date createdDate;


}
