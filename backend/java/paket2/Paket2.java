package paket2;

import paket1.Paket1;

public class Paket2{

    public static void main(String[] args) {
        //farklı paketin farklı classı
        Paket1 deneme=new Paket1();
        String degisken1= deneme.publicDegisken;

    }

}
