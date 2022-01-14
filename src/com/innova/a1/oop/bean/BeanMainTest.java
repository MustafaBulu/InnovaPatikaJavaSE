package com.innova.a1.oop.bean;

public class BeanMainTest {
    public static void main(String[] args) {

        Bean_Lombok bean = new Bean_Lombok();
        bean.setStudentName("Mustafa");
        System.out.println(bean.getStudentName());
        //System.out.println(bean);
        System.out.println(bean.hashCode());
        //hashcode nesnemizin yaşan döngüsü boyunca kendisine atanmış key idsidir.


    }


}


