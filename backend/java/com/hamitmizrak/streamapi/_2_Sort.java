package com.hamitmizrak.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Sort {
    public static void main(String[] args) {
        //sorted() ==> verileri sıralamak için kullanıyoruz

        List<String> list=new ArrayList<>();
        list.add("malatya");
        list.add("ankara");
        list.add("denizli");

        List<String> list2=   list.stream().sorted().collect(Collectors.toList());
        list2.forEach(System.out::println);

    }
}
