package com.hamitmizrak.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  @NoArgsConstructor
public class Teacher extends Person implements IProperty{
    private String teacherHesCode;

    public Teacher(String personName, String personSurname, String teacherHesCode) {
        super(personName, personSurname);
        this.teacherHesCode = teacherHesCode;
    }

    public Teacher(String teacherHesCode) {
        this.teacherHesCode = teacherHesCode;
    }

    @Override
    public String deneme() {
        return "Teacher Polymorphism";
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String name2(String data) {
        return null;
    }
}
