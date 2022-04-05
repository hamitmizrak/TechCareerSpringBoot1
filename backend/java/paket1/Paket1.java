package paket1;

public class Paket1 {
    public String publicDegisken;
    private String privateDegisken;
    protected String protectedDegisken;
    String defaultDegisken;

    public static void main(String[] args) {
        //aynı paketin aynı classı
        Paket1 deneme=new Paket1();
        String degisken1= deneme.publicDegisken;
        String degisken2= deneme.privateDegisken;
        String degisken3= deneme.protectedDegisken;
        String degisken4= deneme.defaultDegisken;
    }
}
