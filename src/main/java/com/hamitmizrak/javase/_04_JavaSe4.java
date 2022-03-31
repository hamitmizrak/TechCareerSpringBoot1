package com.hamitmizrak.javase;


import java.util.Arrays;

public class _04_JavaSe4 {

    public static void sendMail(String data) {
        System.out.println("Mail gönderildi" + data);
    }

    public static void main(String[] args) {
        //access modifier
        //            aynıpaket    farklıpaket    aynıclass  farklı class    subclass
        // public      +            +               +           +               +
        // private     -            -               +           -               -  getter/and
        // protected   ?            ?               ?           ?               +
        // -           +            -               +           +               -


//        try {
//            int sayi = 3 / 0;
//            System.out.println(sayi);
//            //db.close()
//            //socket.close();
//        } catch (ArithmeticException ae) {
//            sendMail(ae.getMessage());
//            ae.printStackTrace();
//        } catch (Exception e) {
//            sendMail(e.getMessage());
//            e.printStackTrace();
//        }finally{
//            System.out.println("Database.close()");
//        }
//
//        System.out.println("10000");

//      int [] array=new int[5];
        int [] array={4,5,3,6,8};
        System.out.println(array[array.length-1]);

//        Arrays.sort();
//        Arrays.binarySearch();
//        Arrays.asList();


    }
}
