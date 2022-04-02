package com.hamitmizrak.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_Filter {



    public static void main(String[] args) {
        //filter():  verilerde istediğimiz sonuçtaki çıkan verileri almak
        List<String> list=new ArrayList<>();
        list.add("malatya");
        list.add("malatya");
        list.add("malatya");
        list.add("malatya");
        list.add("malatya");
        list.add("ankara");
        list.add("denizli");

      //arrow function ()->{}
       // List<String> list2=  list.stream().filter( (temp)->"malatya".equals(temp) ).collect(Collectors.toList());
        List<String> list2=  list.stream().filter( (temp)->"malatya".equals(temp) ).limit(2).collect(Collectors.toList());
        //List<String> list2=  list.stream().filter( (temp)->!"malatya".equals(temp) ).collect(Collectors.toList());
        list2.forEach(System.out::print);

    }
}
