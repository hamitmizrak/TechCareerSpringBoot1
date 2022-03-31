package paket1;

public class FarkliClass {

    public static void main(String[] args) {
        //aynı paketin farklı classı
        Paket1 deneme=new Paket1();
        String degisken1= deneme.publicDegisken;
        String degisken3= deneme.protectedDegisken;
        String degisken4= deneme.defaultDegisken;
    }
}
