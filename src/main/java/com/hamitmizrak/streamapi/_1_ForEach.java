package com.hamitmizrak.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_ForEach {
    public static void main(String[] args) {
        //1.Durum Dizi
        String [] dizi={"malatya","istanbul","ankara"};
        Arrays.asList(dizi).stream().forEach(System.out::println);

        System.out.println("*****************************************");

        //2.Durum Dizi
        List<String> liste1=Arrays.asList("malatya","istanbul","ankara");
        liste1.stream().forEach(System.out::println);

        System.out.println("*****************************************");

        //3.Durum
        List<String> liste2=new ArrayList<>();
        liste2.add("malatya");
        liste2.add("istanbul");
        liste2.add("ankara");
        liste2.forEach(System.out::println);
        System.out.println("*****************************************");
        liste2.stream().forEach(System.out::println);

    }
}
