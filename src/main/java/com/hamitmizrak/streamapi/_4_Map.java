package com.hamitmizrak.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _4_Map {



    public static void main(String[] args) {
        //Lambda Expression
        //map():  verilerdeki her bir elemanı değiştirip,değiştirilmiş şeklini kullanmak
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //her bir elemanı kendisi ile çarpıp  sonuça gösterin.

        list.stream().map( (temp)->temp*temp).limit(3).forEach(System.out::println);  //collect(Collectors.toList());


    }
}
