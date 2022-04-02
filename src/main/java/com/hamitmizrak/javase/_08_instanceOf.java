package com.hamitmizrak.javase;


import paket1.Student;
import paket1.Teacher;

public class _08_instanceOf {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Student student=new Student();

        if(student instanceof Student){
            System.out.println("Aynıdır");
        }
    }


}
