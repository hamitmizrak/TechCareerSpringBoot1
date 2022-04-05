package com.hamitmizrak.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public abstract class Person {
    private String personName;
    private String personSurname;

    public abstract String deneme();
}
