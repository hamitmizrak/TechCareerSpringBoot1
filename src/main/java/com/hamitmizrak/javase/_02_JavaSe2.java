package com.hamitmizrak.javase;


public class _02_JavaSe2 {

    //overloading:
    public static void deneme() {
        System.out.println("voidli");
    }

    public static void deneme(String value) {
        System.out.println("voidli "+value);
    }

    //escape character
    public static String deneme2() {
        return "voidsiz";
    }


    public static void main(String[] args) {
        deneme();
      String str=  deneme2();
//        String kelime = "Malatya İstanbul Ankara";
//        String[] dizi = kelime.split(" ");
//        for (String temp : dizi) {
//            System.out.println(temp);
//        }



        //return ==> metotu bitirmek
        //break  ==> döngüyü bitirmek
        //continue ==> o kısmını geçmek

        int count=0;
        for (int i = 0; i <10 ; i++) {
            if(i==6)
                break;
            if(i==2)
                continue;
             //count+=i;
             //count=count+i;
             count++;
        }
        System.out.println(count);

    }
}
