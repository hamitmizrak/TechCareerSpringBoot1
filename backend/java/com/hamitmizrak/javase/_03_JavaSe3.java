package com.hamitmizrak.javase;

//extends izin vermiyor
public final class _03_JavaSe3 {

    //globabal variable
    //const
    public final static int SAYI=44;

    //overloading:
    //override: ezmek
    public static final void deneme() {
        System.out.println("voidli");

    }

    public static void deneme(String value) {
        System.out.println("voidli " + value);
    }

    //escape character
    public static String deneme2() {
        return "voidsiz";
    }


    public static void main(String[] args) {
        deneme();
        String str = deneme2();
//        String kelime = "Malatya İstanbul Ankara";
//        String[] dizi = kelime.split(" ");
//        for (String temp : dizi) {
//            System.out.println(temp);
//        }


        //return ==> metotu bitirmek
        //break  ==> döngüyü bitirmek
        //continue ==> o kısmını geçmek

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6)
                break;
            if (i == 2)
                continue;
            //count+=i;
            //count=count+i;
            count += i;
            // 0 1 3 4 5
        }
        //System.out.println(count);

        //final :
        final double pi=3.1415;
        //değişkenler ==> sabit
        //metotlar    ==> override edemezsin
        //class       ==> extends izin vermiyor

        //static:
        // Havuza
        // bellekte bir kere oluşur
        // class.ozellikler
        // new kullanabiliyor muyuz ?


    }
}
