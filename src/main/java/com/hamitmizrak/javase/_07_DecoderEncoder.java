package com.hamitmizrak.javase;


import java.util.Base64;
import java.util.Scanner;

public class _07_DecoderEncoder {
    public static void main(String[] args) {
//        System.out.println("Alt satıra geçer");
//        System.out.print("aynı satırda kalır");
//        System.err.println("Alt satıra geçer");
//        System.exit(0);
//        System.gc();
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String value = klavye.nextLine();

        //Encoder
        Base64.Encoder encoder = Base64.getEncoder();
        String masking = encoder.encodeToString(value.getBytes());
        System.out.println("Maskelenmiş veri: " + masking);

        //DEcoder
        Base64.Decoder decoder = Base64.getDecoder();
        //  String kelime="";
        String unMasking = new String(decoder.decode(masking));
        System.out.println("Girdiğiniz kelime: "+value+" Maskelenmiş data: "+masking+" Maske çözümlenmesi: "+unMasking);


    }


}
