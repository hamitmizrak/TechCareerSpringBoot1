package com.hamitmizrak.oop;

public class MainTest {
    public static void main(String[] args) {
        Person person=new Teacher();
        Person person2=new Student();

        //tek yumurta ikizi
        Teacher teacher=new Teacher();
        System.out.println(teacher.deneme());

        Student student=new Student();
        System.out.println(student.deneme());



    }
}
