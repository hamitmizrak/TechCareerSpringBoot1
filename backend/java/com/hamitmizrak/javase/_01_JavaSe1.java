package com.hamitmizrak.javase;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _01_JavaSe1 {
    //tam sayılar: bsil => byte<short<int<long
    //virgüllü : float <double
    //boolean
    //char
    //int a=null;
    //int a;
    //int a=0,
    public static void main(String[] args) {
        int a;
        a = 44;
        Integer i2 = a;
        i2 = null;

//        byte b1=null;
//        Byte b2=null;
//        String asd=null;
//        Integer i2=new Integer(44);
        String result=(4>1) ?"büyük" :"küçük" ;
        System.out.println(result);
        // new null sıfır
        // new ==> Ram bizim için yer ayırır
        // null => Ram bizim için yer ayırmış alanı boşaltır
        // sıfır!=null

        String str="Java SE JSP SE";
        //char c1=str.charAt(0);
        //System.out.println(c1);
        System.out.println(str.indexOf("SE"));
        System.out.println(str.lastIndexOf("SE"));

        Scanner klavye=new Scanner(System.in);

        System.out.println(Math.min(4,5));
        System.out.println(Math.round(Math.random()*4+1)  );

        //cast: parseInt,toString,valueOf
        // st1+st2+st3 ...s100
        // concat
        StringBuilder builder=new StringBuilder();
        StringBuffer stringBuffer=new StringBuffer();

        StringTokenizer stringTokenizer=new StringTokenizer("asd ads");
        //doğal Dil işleme : / *



    }
}
