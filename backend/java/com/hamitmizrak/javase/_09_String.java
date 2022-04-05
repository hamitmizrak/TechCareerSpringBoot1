package com.hamitmizrak.javase;


import java.util.StringTokenizer;

public class _09_String {
    public static void main(String[] args) {
        String data1="Adana";
        String data2=" Balikesir";

        //birleştirme
        System.out.println(data1+data2);

        //concat
        System.out.println(data1.concat(data2));

        //String Builder
        StringBuilder builder=new StringBuilder();
        builder.append(data1).append(data2);
        String change=builder.toString();
        System.out.println(change);

        //String Buffer
        StringBuffer buffer=new StringBuffer();
        buffer.append("html5+").append("css3&").append("js`").append("jquery+").append("spring");
        String change2=buffer.toString();
        System.out.println(change2);

        //////////////////////////////////
        System.out.println("*****************************");
        //split() ==> StringTokenizer
        StringTokenizer tokenizer=new StringTokenizer(change2,"+& ");
        while(tokenizer.hasMoreElements()){
            String temp= tokenizer.nextToken();
            System.out.println(temp);
        }

        //senkron :aynı anda birden fazla process çalışması
        //asenkron: tek bir prosesin çalışması

    }
}
